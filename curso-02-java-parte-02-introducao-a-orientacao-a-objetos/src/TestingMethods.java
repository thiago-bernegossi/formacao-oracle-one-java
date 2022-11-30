// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingMethods {

	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.accountBalance = 250;		
		firstAccount.accountNickname = "Primeira Conta";
		firstAccount.depositValue(250);
		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****");	
		System.out.println();

		System.out.println("A-) O saldo atual da " + firstAccount.accountNickname + " é: R$ " + firstAccount.accountBalance + ";");
		System.out.println("B-) A agência da " + firstAccount.accountNickname + " é: " + firstAccount.accountAgency + ".");	
		
		System.out.println();
		System.out.println("***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
