package process_planning;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.Workbench;

import helpers.HttpRequestHelper;
import process_modeling.Process;


public class SignDocumentHandler extends AbstractHandler {

	public static String resourcePath = "/signed_documents";
	public HttpRequestHelper httpRequestHelper = new HttpRequestHelper(resourcePath);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		@SuppressWarnings("restriction")
		IEditorPart editor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof DialectEditor) {
			DialectEditor dialectEditor = (DialectEditor) editor;
			DRepresentation representation = dialectEditor.getRepresentation();
			if (representation instanceof DSemanticDecorator) {
				DSemanticDecorator semanticDecorator = (DSemanticDecorator) representation;

				Process process = (Process) semanticDecorator.getTarget();
				String requestBody = "{ \"name\": \"" + process.getId() + "\" }";
				try {
					httpRequestHelper.sendPostRequest(requestBody);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
