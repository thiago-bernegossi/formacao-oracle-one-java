// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public abstract class AuthenticateAccess {
	
	private String directorPassword = "*ABCD1234*";
	private String managerPassword = "*EFGH5678*";
	
	public boolean authenticatePassword(String password) {
		if (this.directorPassword == password || this.managerPassword == password) {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do funcionário " + super.getEmployeeName() + " fora realizada.");
			return true;
		} else {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do funcionário " + super.getEmployeeName() + " não fora realizada.");
			return false;
		}
	}
}
