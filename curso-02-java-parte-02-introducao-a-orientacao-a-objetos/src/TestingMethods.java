// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingMethods {

	public static void main(String[] args) {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****");	
		System.out.println();
		
		Account firstAccount = new Account();
		
		firstAccount.accountNickname = "Primeira Conta";
		System.out.println("A-) A agência da " + firstAccount.accountNickname + " é " + firstAccount.accountAgency + ".");	

		firstAccount.depositValue(75);
		System.out.println("B-) O saldo atual da " + firstAccount.accountNickname + " é R$ " + firstAccount.accountBalance + ".");
		
		firstAccount.withdrawValue(50);
		
		System.out.println();
		System.out.println("***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
