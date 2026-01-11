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

public class IPLaunchDialog extends TitleAreaDialog  {
    private Text txtCbpInstanceId;
    private Text txtIpInstanceId;

    private String cbpInstanceId;
    private String ipInstanceId;

    public IPLaunchDialog(Shell parentShell) {
        super(parentShell);
    }

    @Override
    public void create() {
        super.create();
        setTitle("This is my first custom dialog");
        setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);

        createCbpIdField(container);
        createIpIdField(container);

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

    private void createIpIdField(Composite container) {
        Label lblIpId = new Label(container, SWT.NONE);
        lblIpId.setText("IP instance ID:");

        GridData dataIpId = new GridData();
        dataIpId.grabExcessHorizontalSpace = true;
        dataIpId.horizontalAlignment = GridData.FILL;
        txtIpInstanceId = new Text(container, SWT.BORDER);
        txtIpInstanceId.setLayoutData(dataIpId);
    }



    @Override
    protected boolean isResizable() {
        return true;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
        cbpInstanceId = txtCbpInstanceId.getText();
        ipInstanceId = txtIpInstanceId.getText();

    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public String getCbpInstanceId() {
        return cbpInstanceId;
    }

    public String getIpInstanceId() {
        return ipInstanceId;
    }
}
