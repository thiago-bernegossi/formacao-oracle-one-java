// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingAccounts {

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
		
		System.out.println();
		
		Account secondAccount = new Account("Segunda Conta", 654321, 234567891);				
		System.out.println("O apelido da conta é " + secondAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountNumber() + ".");	
		
		Client secondClient = new Client();
		secondAccount.setAccountClient(secondClient);
		
		secondAccount.getAccountClient().setClientName("Leonardo");
		System.out.println("O nome do titular da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountClient().getClientName() + ".");	
		
		System.out.println();
		
		Account thirdAccount = new Account("Terceira Conta", 654321, 345678912);				
		System.out.println("O apelido da conta é " + thirdAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountNumber() + ".");	
		
		Client thirdClient = new Client();
		thirdAccount.setAccountClient(thirdClient);
		
		thirdAccount.getAccountClient().setClientName("Michelangelo");
		System.out.println("O nome do titular da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountClient().getClientName() + ".");	
		
		System.out.println();
		
		Account fourthAccount = new Account("Quarta Conta", 654321, 456789123);		
		System.out.println("O apelido da conta é " + fourthAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountNumber() + ".");	
		
		Client fourthClient = new Client();		
		fourthAccount.setAccountClient(fourthClient);		
		
		fourthAccount.getAccountClient().setClientName("Raphael");
		System.out.println("O nome do titular da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountClient().getClientName() + ".");	
		
		System.out.println("\nObs.: A quantidade de contas abertas no ByteBank é " + Account.getAmountOfBankAccounts() + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
