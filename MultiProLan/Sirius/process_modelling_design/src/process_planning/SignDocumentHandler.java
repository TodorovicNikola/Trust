package process_planning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.Workbench;

import helpers.HttpRequestHelper;
import process_modeling.Process;
import utils.XMLUtils;


public class SignDocumentHandler extends AbstractHandler {

	public static String resourcePath = "/signed_documents";
	public HttpRequestHelper httpRequestHelper = new HttpRequestHelper(resourcePath);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		XMLSigningService xmlSigningService = new XMLSigningService();
		@SuppressWarnings("restriction")
		IEditorPart editor = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof DialectEditor) {
			DialectEditor dialectEditor = (DialectEditor) editor;
			DRepresentation representation = dialectEditor.getRepresentation();
			if (representation instanceof DSemanticDecorator) {
				DSemanticDecorator semanticDecorator = (DSemanticDecorator) representation;

				String path = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(semanticDecorator.getTarget().eResource().getURI().toPlatformString(true))).getLocationURI()
						.toString().substring(6);
				System.out.println("Path: " + path);

				Process process = (Process) semanticDecorator.getTarget();
				String virtualOrganizationId = "1";
				String organizationId = "1";
				String name = process.getId().toString();

				HttpRequestHelper submitDocumentEndpoint = new HttpRequestHelper("/submitted_documents");
				Map<String, String> requestParams = new HashMap<String, String>();
				requestParams.put("virtualOrganizationId", virtualOrganizationId);
				requestParams.put("organizationId", organizationId);
				requestParams.put("name", name);

				String response = submitDocumentEndpoint.sendGetRequest(requestParams);		
				String modelXML = XMLUtils.decodeString(response);
					
				String signatureXML = xmlSigningService.signDocument(modelXML);

				String encodedXMLSignature = Base64.getEncoder().encodeToString(signatureXML.getBytes());
					
				String requestBody = "{ \"virtualOrganizationId\":" + virtualOrganizationId
						+ ", \"organizationId\":" + organizationId
						+ ", \"name\": \"" + name
						+ "\", \"encodedContent\":\"" + encodedXMLSignature +  "\" }";
					
				System.out.println(requestBody);
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
