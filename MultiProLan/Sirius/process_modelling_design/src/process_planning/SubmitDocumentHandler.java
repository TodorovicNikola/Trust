package process_planning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import helpers.HttpRequestHelper;
import process_modeling.Process;
import utils.XMLUtils;

public class SubmitDocumentHandler extends AbstractHandler {

	public static String resourcePath = "/submitted_documents";
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
				String path = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(semanticDecorator.getTarget().eResource().getURI().toPlatformString(true))).getLocationURI()
						.toString().substring(6);
				System.out.println("Path: " + path);

				try (FileInputStream file = new FileInputStream(path);
						BufferedReader reader = new BufferedReader(new InputStreamReader(file));) {

					String modelXML = "";
					String line;
					while ((line = reader.readLine()) != null) {
						modelXML += line;
					}

					String cleanedModel = removeElementsPrivateToOrg(new String(modelXML.getBytes()));
					String encodedXMLModel = Base64.getEncoder().encodeToString(cleanedModel.getBytes());

					Process process = (Process) semanticDecorator.getTarget();

					String requestBody = "{ \"virtualOrganizationId\":1, \"organizationId\":1, \"name\": \"" + process.getId() + "\", \"encodedContent\":\"" + encodedXMLModel +  "\" }";
					System.out.println(requestBody);
					httpRequestHelper.sendPostRequest(requestBody);
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

	public static String removeElementsPrivateToOrg(String decodedContent) {
		Document document = XMLUtils.getDocumentFromXML(decodedContent);

		assert document != null;
		removeElementsPrivateToOrg(document.getDocumentElement());

		return XMLUtils.getXMLFromDocument(document);
	}

	private static void removeElementsPrivateToOrg(Element element) {
		NodeList nodeList = element.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element child = (Element) nodeList.item(i);
				// These elements are on CBP layer, we don't touch those
				if (element.getTagName().equals("organizations"))
					continue;
				// Elements without this attribute should be removed
				if (child.hasAttribute("exposeToCollaboratingParties"))
					removeElementsPrivateToOrg(child);
				else
					element.removeChild(child);
			}
		}
	}

}
