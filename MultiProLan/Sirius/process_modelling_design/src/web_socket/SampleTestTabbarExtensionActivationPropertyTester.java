package web_socket;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramElementEditPart;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;

public class SampleTestTabbarExtensionActivationPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
//		if ("isConcernedEditor".equals(property)) {
//            // called in a with activeEditor element
//            if (receiver instanceof DialectEditor) {
//                DRepresentation activeRepresentation = ((DialectEditor) receiver).getRepresentation();
//                if (activeRepresentation instanceof DDiagram) {
//                    // the id property in the VSM editor : name in the meta
//                    // model.
//                    return "diagram.description.sample.id".equals(((DDiagram) activeRepresentation).getDescription().getName());
//                }
//            }
//        } else if ("shouldActivateTabbarExtension".equals(property)) {
//            if (receiver instanceof IDiagramElementEditPart) {
//                EObject domainElement = ((IDiagramElementEditPart) receiver).resolveTargetSemanticElement();
//                // sample condition
//                return domainElement instanceof EClass && ((EClass) domainElement).isAbstract();
//            }
//        }
//        return false;
		return true;
	}

}
