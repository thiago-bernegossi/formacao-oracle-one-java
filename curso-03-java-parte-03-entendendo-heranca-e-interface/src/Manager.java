// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Manager extends Employee implements AuthenticateAccess {

	private String managerPassword = "*EFGH5678*";

	@Override
	public boolean authenticatePassword(String password) {
		if (this.managerPassword == password) {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do gerente " + super.getEmployeeName() + " fora realizada.");
			return true;
		} else {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do gerente " + super.getEmployeeName() + " não fora realizada.");
			return false;
		}
	}
	
	@Override
	public double employeeSalaryBonus() {
		return super.getEmployeeSalary() * 0.25;
	}
}
