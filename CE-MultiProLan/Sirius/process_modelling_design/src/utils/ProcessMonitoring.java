package utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.LaunchedProcessStatusDto;
import helpers.HttpRequestHelper;
import process_modeling.EProcessElementObligationsFulfilled;
import process_modeling.EProcessElementStatus;
import process_modeling.Process_modelingPackage;

public class ProcessMonitoring {

	private Resource resource;
	private List<process_modeling.ProcessElement> processElements;
	private String cbpId;
	private String ipId;
	private HttpRequestHelper httpRequestHelper;

	public ProcessMonitoring(String path, String cbpId, String ipId, HttpRequestHelper httpRequestHelper) {
		super();

		// create a resource
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(Process_modelingPackage.eNS_URI, Process_modelingPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("process_modeling",
				new XMIResourceFactoryImpl());
		this.resource = resourceSet.getResource(URI.createFileURI(path), true);

		// create a process modeling object
//				Process_modelingPackage.eINSTANCE.eClass();

		this.cbpId = cbpId;
		this.ipId = ipId;
		initProcessElements();

		this.httpRequestHelper = httpRequestHelper;

	}

	public static String getUniqueNameForElement(process_modeling.ProcessElement element) {
		String transformedName = element.getName().replace('-', '_').replace(" ", "").replace("(", "_").replace(")",
				"_");
		String firstNChars = transformedName.substring(0, Math.min(transformedName.length(), 22));

		String uniqueName = "El_" + firstNChars + "___" + element.getId().substring(0, 4);
		return uniqueName;
	}

	public void setProcessElementStatus(String elementUniqueName, EProcessElementStatus status)
			throws URISyntaxException {

		for (process_modeling.ProcessElement element : processElements) {
			if (elementUniqueName.equals(getUniqueNameForElement(element))) {
				element.setStatus(status);
			}
		}

		saveResource();
	}

	private void saveResource() {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void initProcessElements() {
		this.processElements = new ArrayList<>();
		process_modeling.Process process = (process_modeling.Process) resource.getContents().get(0);

		if (ipId == null || ipId == "") {
			process_modeling.VirtualOrganization virtualOrganization = (process_modeling.VirtualOrganization) process
					.getElements().get(0);

			for (process_modeling.Organization organization : virtualOrganization.getOrganizations()) {
				for (process_modeling.ProcessElement element : organization.getElements()) {
					this.processElements.add(element);
				}

			}
		} else {
			for (process_modeling.ProcessElement element : process.getElements()) {
				this.processElements.add(element);
			}
		}

	}

	public void setAllProcessElementsAsInactive() {
		for (process_modeling.ProcessElement element : processElements) {
			element.setStatus(EProcessElementStatus.INACTIVE);
		}

		saveResource();

	}

	public void setProcessElementDltContent(String elementUniqueName, String dltContent) {
		for (process_modeling.ProcessElement element : processElements) {
			if (elementUniqueName.equals(getUniqueNameForElement(element))) {
				element.setRelatedDltContent(dltContent);
			}
		}

		saveResource();

	}

	public void setObligationsUnfulfilled(String elementUniqueName) {
		for (process_modeling.ProcessElement element : processElements) {
			if (elementUniqueName.equals(getUniqueNameForElement(element))) {
				element.setObligationsFulfilled(EProcessElementObligationsFulfilled.FALSE);
			}
		}

		saveResource();

	}

	public void printAllProcessElements() {
		for (process_modeling.ProcessElement element : processElements) {
			System.out.println("Name: " + element.getName() + ", id: " + element.getId() + ", status: "
					+ element.getStatus().toString() + ", oblFulfilled: "
					+ element.getObligationsFulfilled().toString());
		}

	}

	public void setAllProcessElementsAsObligationsFulfilled() {
		for (process_modeling.ProcessElement element : processElements) {
			element.setObligationsFulfilled(EProcessElementObligationsFulfilled.TRUE);
		}

		saveResource();

	}

	public void startMonitoring() throws InterruptedException {
		resetDiagram();

		while (true) {
			setAllProcessElementsAsInactive();

			String response = getProcessStatus();

			if (response != null) {
				ObjectMapper objectMapper = new ObjectMapper();
				LaunchedProcessStatusDto lpsd;
				try {
					lpsd = objectMapper.readValue(response, LaunchedProcessStatusDto.class);

					setStatusForActiveProcessElements(lpsd);

					setStatusForCompletedProcessElements(lpsd);

					setObligationsUnfulfilledForElements(lpsd);

					setDltContentForAllElements(lpsd);

					printAllProcessElements();

					refreshDiagram();

					if (lpsd.getTerminationActivated()) {
						break;
					}

					// TODO: ConstraintsFulfilled ne koristis!
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			Thread.sleep(15000);
		}
	}

	private void resetDiagram() {
		setAllProcessElementsAsInactive();
		setAllProcessElementsAsObligationsFulfilled();

		refreshDiagram();
	}

	private String getProcessStatus() {
		Map<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("cbpId", cbpId);
		requestParams.put("ipId", ipId);
		String response = httpRequestHelper.sendGetRequest(requestParams);
		return response;
	}

	private void refreshDiagram() {
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void setObligationsUnfulfilledForElements(LaunchedProcessStatusDto lpsd) {
		for (String elementUniqueName : lpsd.getElementsWithUnfulfilledConstraints()) {
			setObligationsUnfulfilled(elementUniqueName);
		}

	}

	private void setStatusForCompletedProcessElements(LaunchedProcessStatusDto lpsd) {
		for (String elementUniqueName : lpsd.getCompletedElements()) {

			try {
				setProcessElementStatus(elementUniqueName, EProcessElementStatus.COMPLETED);

			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void setDltContentForAllElements(LaunchedProcessStatusDto lpsd) {
		for (String elementUniqueName : lpsd.getRelatedDltContent().keySet()) {
			setProcessElementDltContent(elementUniqueName, lpsd.getRelatedDltContent().get(elementUniqueName));
		}
	}

	private void setStatusForActiveProcessElements(LaunchedProcessStatusDto lpsd) {
		for (String activeElementUniqueName : lpsd.getCurrentlyActiveElements()) {
			try {
				setProcessElementStatus(activeElementUniqueName, EProcessElementStatus.ACTIVE);

			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
