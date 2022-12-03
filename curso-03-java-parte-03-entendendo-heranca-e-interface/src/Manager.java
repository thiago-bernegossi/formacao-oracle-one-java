// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Manager extends Employee {

	private String managerPassword = "*ABCD1234*";
	
	public String getManagerPassword() {
		return this.managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	
	public boolean authenticatePassword(String managerPassword) {
		if (this.managerPassword == managerPassword) {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do gerente " + this.getEmployeeName() + " fora realizada.");
			return true;
		} else {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do gerente " + this.getEmployeeName() + " não fora realizada.");
			return false;
		}
	}
}