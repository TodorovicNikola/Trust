package web_socket.process_execution;

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

public class LaunchProcessHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// treba izvuci dokument_id, proveriti koji je tip procesa pa u skladu s tim i
		// odgovarajuci dijalog iskoristiti, kao i odgovarajuci resurs na BE pogoditi

		@SuppressWarnings("restriction")
		IEditorPart editor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof DialectEditor) {
			DialectEditor dialectEditor = (DialectEditor) editor;
			DRepresentation representation = dialectEditor.getRepresentation();
			if (representation instanceof DSemanticDecorator) {
				DSemanticDecorator semanticDecorator = (DSemanticDecorator) representation;
				String path = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(semanticDecorator.getTarget().eResource().getURI().toPlatformString(true)))
						.getLocationURI().toString().substring(6);
				System.out.println("Path: " + path);

				try (FileInputStream file = new FileInputStream(path);
						BufferedReader reader = new BufferedReader(new InputStreamReader(file));) {

					String modelXML = "";
					String line;
					while ((line = reader.readLine()) != null) {
						modelXML += line;
					}

					if (modelXML.contains("Organization")) {
						CBPLaunchDialog dialog = new CBPLaunchDialog(
								Workbench.getInstance().getActiveWorkbenchWindow().getShell());
						dialog.create();
						if (dialog.open() == Window.OK) {
							System.out.println(dialog.getCbpInstanceId());
						}
					} else {
						IPLaunchDialog dialog = new IPLaunchDialog(
								Workbench.getInstance().getActiveWorkbenchWindow().getShell());
						dialog.create();
						if (dialog.open() == Window.OK) {
							System.out.println(dialog.getCbpInstanceId());
							System.out.println(dialog.getIpInstanceId());
						}
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		}

		return null;
	}

}
