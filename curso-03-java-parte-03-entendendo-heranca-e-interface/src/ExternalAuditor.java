// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class ExternalAuditor extends Employee implements AuthenticateAccess {
	
	private AuthenticationProcess authenticator;

	public ExternalAuditor() {
		this.authenticator = new AuthenticationProcess();
	}

	@Override
	public boolean authenticatePassword(String password) {
		return this.authenticator.authenticatePassword(password);
	}
	
	@Override
	public double employeeSalaryBonus() {
		return super.getEmployeeSalary() * 0.25;
	}
}
