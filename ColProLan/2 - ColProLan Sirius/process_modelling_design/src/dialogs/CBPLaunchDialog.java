package dialogs;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class CBPLaunchDialog extends TitleAreaDialog {

    private Text txtCbpInstanceId;

    private String cbpInstanceId;

    public CBPLaunchDialog(Shell parentShell) {
        super(parentShell);
    }

    @Override
    public void create() {
        super.create();
        setTitle("CBP Instance ID");
        setMessage("Please enter a value for CBP instance ID:", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(1, false);
        container.setLayout(layout);

        createCbpIdField(container);

        return area;
    }

    private void createCbpIdField(Composite container) {
        Label lblCbpId = new Label(container, SWT.NONE);
        lblCbpId.setText("CBP instance ID:");

        GridData dataCbpId = new GridData();
        dataCbpId.grabExcessHorizontalSpace = true;
        dataCbpId.horizontalAlignment = GridData.FILL;

        txtCbpInstanceId = new Text(container, SWT.BORDER);
        txtCbpInstanceId.setLayoutData(dataCbpId);
    }



    @Override
    protected boolean isResizable() {
        return false;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
        cbpInstanceId = txtCbpInstanceId.getText();

    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public String getCbpInstanceId() {
        return cbpInstanceId;
    }
}
