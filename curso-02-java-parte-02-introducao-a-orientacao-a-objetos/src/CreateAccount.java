// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class CreateAccount {

	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.accountBalance = 500;
		
		System.out.println("Olá! Seja muito bem-vindo(a) ao ByteBank!\n");	
		
		System.out.println("A-) O saldo atual da conta é: R$ " + firstAccount.accountBalance + ".");
		
		System.out.println("\nObrigado(a) por utilizar nossos serviços.");
	}
}
