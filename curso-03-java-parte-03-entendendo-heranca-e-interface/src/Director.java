// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Director extends Employee implements AuthenticateAccess {

	private String directorPassword = "*ABCD0123*";
	
	@Override
	public boolean authenticatePassword(String password) {
		if (this.directorPassword == password) {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do diretor " + super.getEmployeeName() + " fora realizada.");
			return true;
		} else {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do diretor " + super.getEmployeeName() + " não fora realizada.");
			return false;
		}
	}
	
	@Override
	public double employeeSalaryBonus() {
		return super.getEmployeeSalary() * 0.50;
	}
}
