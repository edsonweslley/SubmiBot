package p2.submibot.ui;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

public class CredentialsUI {
	
	private Shell activeShell;
	private String nome, sobrenome, senha, filename, assignment;
	private boolean state;
	
	public CredentialsUI(Shell shell) {
		this.activeShell = shell;
		this.state = true;
	}

	public void execute() throws ExecutionException {
		DialogUI dialog = new DialogUI(this.activeShell);

		if (dialog.open() == Window.OK) {
			this.nome = dialog.getFirstName();
			this.sobrenome = dialog.getLastName();
			this.senha = dialog.getPassword();
			this.filename = dialog.getFilename();
			this.assignment = dialog.getAssignment();
			this.state = false;
		}
	}
	
	public String getNome() { return nome; }

	public String getSobrenome() { return sobrenome; }

	public String getSenha() { return senha; }

	public String getFilename() { return filename; }
	
	public boolean getState() { return this.state; }
	
	public String getAssignment() { return this.assignment; }
}