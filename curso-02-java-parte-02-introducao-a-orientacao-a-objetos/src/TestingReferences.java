// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingReferences {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account firstAccount = new Account("Primeira Conta", 654321, 123456789);		
		Account secondAccount = firstAccount;
		
		System.out.println("O apelido da conta é " + firstAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountNumber() + ".");			
		
		firstAccount.depositValue(100);		
		
		System.out.println();
		
		System.out.println("O saldo atual da " + firstAccount.getAccountNickname() + " é R$ " + firstAccount.getAccountBalance() + ".");
		System.out.println("A agência da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountAgency() + ".");	
		
		System.out.println();
		
		System.out.println("O saldo atual da " + secondAccount.getAccountNickname() + " é R$ " + secondAccount.getAccountBalance() + ".");
		System.out.println("A agência da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountAgency() + ".");	
		
		System.out.println();
		
		if (firstAccount == secondAccount) {
			System.out.println("Obs.: Existem várias referências para o mesmo objeto do tipo Conta!");
		} else {
			System.out.println("Obs.: Não existem várias referências para o mesmo objeto do tipo Conta!");
		}
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
