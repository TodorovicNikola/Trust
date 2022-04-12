package web_socket;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import process_modeling.Process_modelingFactory;
import process_modeling.Process_modelingPackage;

public class ProcessMonitoring {

	private String path;
	private String processId;

	public ProcessMonitoring(String path, String processId) {
		super();
		this.path = path;
		this.processId = processId;
	}

	public void changeProcessElementColor() throws URISyntaxException {

		// create a resource
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(Process_modelingPackage.eNS_URI, Process_modelingPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("process_modeling",
				new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI(path), true);

		// create a process modeling object
//		Process_modelingPackage.eINSTANCE.eClass();
		Process_modelingFactory factory = Process_modelingFactory.eINSTANCE;
		process_modeling.Process process = factory.createProcess();
		process = (process_modeling.Process) resource.getContents().get(0);
		System.out.println(process.getId());
//		menjaj ovde status procesa
		if(process.isExposeToCollaboratingParties()) {
			System.out.println("trenutno na true");
			// TODO: update stanja elemenata...
		} else {
			System.out.println("trenutno na false, pokusavam promeniti...");
			process.setExposeToCollaboratingParties(true);
		}


//		na kraju sacuvaj
		// save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
			// System.out.println(elementId);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
