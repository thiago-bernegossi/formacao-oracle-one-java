// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class ExternalAuditor extends Employee implements AuthenticateAccess {

	private String externalAuditorPassword = "*IJKL8901*";

	@Override
	public boolean authenticatePassword(String password) {
		if (this.externalAuditorPassword == password) {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do auditor externo " + super.getEmployeeName() + " fora realizada.");
			return true;
		} else {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do auditor externo " + super.getEmployeeName() + " não fora realizada.");
			return false;
		}
	}
	
	@Override
	public double employeeSalaryBonus() {
		return super.getEmployeeSalary() * 0.25;
	}
}
