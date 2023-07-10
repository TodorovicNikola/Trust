package process_execution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.Workbench;

import dialogs.CBPLaunchDialog;
import dialogs.IPLaunchDialog;
import helpers.HttpRequestHelper;
import utils.ProcessMonitoring;

public class LaunchProcessHandler extends AbstractHandler {

	public static String resourcePath = "/launched_processes";
	public HttpRequestHelper httpRequestHelper = new HttpRequestHelper(resourcePath);
	private String cbpId;
	private String ipId;
	private String path;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		@SuppressWarnings("restriction")
		IEditorPart editor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof DialectEditor) {
			DialectEditor dialectEditor = (DialectEditor) editor;
			DRepresentation representation = dialectEditor.getRepresentation();
			if (representation instanceof DSemanticDecorator) {
				initializePath(representation);
				initializeIdValues();

				launchProcess();
				monitorProcess();

			}
		}
		return null;
	}

	private void monitorProcess() {
		ProcessMonitoring processMonitoring = new ProcessMonitoring(path, cbpId, ipId, httpRequestHelper);

		new Thread(() -> {
			try {
				processMonitoring.startMonitoring();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		;
	}

	private void initializePath(DRepresentation representation) {
		DSemanticDecorator semanticDecorator = (DSemanticDecorator) representation;
		path = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(semanticDecorator.getTarget().eResource().getURI().toPlatformString(true)))
				.getLocationURI().toString().substring(6);
		System.out.println("Path: " + path);
	}

	private void launchProcess() {
		try {
			String requestBody = "{ \"cbpId\": \"" + cbpId + "\",  \"ipId\": \"" + ipId + "\"}";
			httpRequestHelper.sendPostRequest(requestBody);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initializeIdValues() {
		String modelXML = "";
		modelXML = readXmlFile();


		if (modelXML.contains("Organization")) {
			CBPLaunchDialog dialog = new CBPLaunchDialog(
					Workbench.getInstance().getActiveWorkbenchWindow().getShell());
			dialog.create();
			if (dialog.open() == Window.OK) {
				cbpId = dialog.getCbpInstanceId();
				ipId = "";
			}
		} else {
			IPLaunchDialog dialog = new IPLaunchDialog(
					Workbench.getInstance().getActiveWorkbenchWindow().getShell());
			dialog.create();
			if (dialog.open() == Window.OK) {
				cbpId = dialog.getCbpInstanceId();
				ipId = dialog.getIpInstanceId();
			}
		}
	}

	private String readXmlFile() {
		String modelXML = "";

		try (FileInputStream file = new FileInputStream(path);
				BufferedReader reader = new BufferedReader(new InputStreamReader(file));) {

			String line;
			while ((line = reader.readLine()) != null) {
				modelXML += line;
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return modelXML;
	}

}
