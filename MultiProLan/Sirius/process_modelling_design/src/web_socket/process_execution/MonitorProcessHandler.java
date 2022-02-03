package web_socket.process_execution;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.Workbench;

import web_socket.ProcessMonitoring;


public class MonitorProcessHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		@SuppressWarnings("restriction")
		IEditorPart editor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(editor instanceof DialectEditor) {
			DialectEditor dialectEditor = (DialectEditor) editor;
			DRepresentation representation = dialectEditor.getRepresentation();
			if(representation instanceof DSemanticDecorator) {
				DSemanticDecorator semanticDecorator = (DSemanticDecorator) representation;
				
				EObject process = semanticDecorator.getTarget();

				String path = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(process.eResource().getURI().toPlatformString(true))).getLocationURI().toString().substring(5);
				System.out.println("Path: " + path);
				try {
					String content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
					System.out.println("Content: " + content);
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				System.out.println("Putanja: " + path);
				ProcessMonitoring processMonitoring = new ProcessMonitoring(path, "1234567890");
				try {
					processMonitoring.changeProcessElementColor();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		
		System.out.println("Proslo...");
		return null;
		}

}
