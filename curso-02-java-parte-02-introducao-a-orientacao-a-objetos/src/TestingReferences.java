// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingReferences {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account firstAccount = new Account();
		firstAccount.accountNickname = "Primeira Conta";
		
		Account secondAccount = firstAccount;

		System.out.println("D-) O saldo atual da " + firstAccount.accountNickname + " é R$ " + firstAccount.returnAccountBalance() + ".");
		System.out.println("B-) A agência da " + firstAccount.accountNickname + " é " + firstAccount.accountAgency + ".");	
		
		firstAccount.depositValue(100);		
		
		System.out.println();
		
		System.out.println("D-) O saldo atual da " + firstAccount.accountNickname + " é R$ " + firstAccount.returnAccountBalance() + ".");
		System.out.println("B-) A agência da " + firstAccount.accountNickname + " é " + firstAccount.accountAgency + ".");	
		
		System.out.println();
		
		System.out.println("D-) O saldo atual da " + secondAccount.accountNickname + " é R$ " + secondAccount.returnAccountBalance() + ".");
		System.out.println("B-) A agência da " + secondAccount.accountNickname + " é " + secondAccount.accountAgency + ".");	
		
		System.out.println();
		
		if (firstAccount == secondAccount) {
			System.out.println("Obs.: Existem várias referências para o mesmo objeto do tipo Conta!");
		} else {
			System.out.println("Obs.: Não existem várias referências para o mesmo objeto do tipo Conta!");
		}
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
