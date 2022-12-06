// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Director extends Employee {

	private String directorPassword = "*EFGH5678*";
	
	public boolean authenticatePassword(String directorPassword) {
		if (this.directorPassword == directorPassword) {
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
	
	public String getDirectorPassword() {
		return this.directorPassword;
	}

	public void setDirectorPassword(String directorPassword) {
		this.directorPassword = directorPassword;
	}
}
