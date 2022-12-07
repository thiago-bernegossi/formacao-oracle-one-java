// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class AuthenticationProcess {
	
	private String directorPassword = "*ABCD0123*";
	private String externalAuditorPassword = "*IJKL8901*";
	private String managerPassword = "*EFGH4567*";
	
	public boolean authenticatePassword(String password) {
		if (this.directorPassword == password || this.externalAuditorPassword == password || this.managerPassword == password) {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do funcionário fora realizada.");
			return true;
		} else {
			System.out.println("\n--- OPERAÇÃO DE AUTENTICAÇÃO ---");
			System.out.println("A operação de autenticação do funcionário não fora realizada.");
			return false;
		}
	}
}
