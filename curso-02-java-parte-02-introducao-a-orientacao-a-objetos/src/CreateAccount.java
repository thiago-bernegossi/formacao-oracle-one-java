// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class CreateAccount {

	public static void main(String[] args) {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account firstAccount = new Account("Primeira Conta", 654321, 123456789);				
		System.out.println("O apelido da conta é " + firstAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountNumber() + ".");	
		
		Client firstClient = new Client();
		firstAccount.setAccountClient(firstClient);
		
		firstAccount.getAccountClient().setClientName("Donatello");
		System.out.println("O nome do titular da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountClient().getClientName() + ".");	

		firstAccount.depositValue(150);		
		firstAccount.withdrawValue(50);
		
		System.out.println();
		
		Account secondAccount = new Account("Segunda Conta", 654321, 234567891);				
		System.out.println("O apelido da conta é " + secondAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountNumber() + ".");	
		
		Client secondClient = new Client();
		secondAccount.setAccountClient(secondClient);
		
		secondAccount.getAccountClient().setClientName("Leonardo");
		System.out.println("O nome do titular da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountClient().getClientName() + ".");	

		secondAccount.depositValue(150);				
		firstAccount.transferValue(50, secondAccount);	
		
		System.out.println();
		
		System.out.println("O saldo atual da " + firstAccount.getAccountNickname() + " é R$ " + firstAccount.getAccountBalance() + ".");
		System.out.println("O saldo atual da " + secondAccount.getAccountNickname() + " é R$ " + secondAccount.getAccountBalance() + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
