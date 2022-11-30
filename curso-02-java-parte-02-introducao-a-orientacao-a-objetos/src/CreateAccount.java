// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class CreateAccount {

	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.accountBalance = 1000;
		firstAccount.accountNickname = "Primeira Conta";
		
		Account secondAccount = new Account();
		secondAccount.accountBalance = 500;
		secondAccount.accountNickname = "Segunda Conta";
		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****");	
		System.out.println();

		System.out.println("A-) O saldo atual da " + firstAccount.accountNickname + " é: R$ " + firstAccount.accountBalance + ";");
		System.out.println("B-) A agência da " + firstAccount.accountNickname + " é: " + firstAccount.accountAgency + ".");	
		
		System.out.println();
		
		System.out.println("A-) O saldo atual da " + secondAccount.accountNickname + " é: R$ " + secondAccount.accountBalance + ";");
		System.out.println("B-) A agência da " + secondAccount.accountNickname + " é: " + secondAccount.accountAgency + ".");		
		
		System.out.println();
		System.out.println("***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
