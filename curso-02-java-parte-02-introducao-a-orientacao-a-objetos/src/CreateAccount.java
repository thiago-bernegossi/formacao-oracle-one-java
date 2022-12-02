// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class CreateAccount {

	public static void main(String[] args) {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account firstAccount = new Account();
		
		firstAccount.setAccountNickname("Primeira Conta");
		System.out.println("A-) O apelido da conta é " + firstAccount.getAccountNickname() + ".");
		
		firstAccount.setAccountAgency(654321);
		System.out.println("B-) A agência da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountAgency() + ".");	
		
		firstAccount.setAccountNumber(123456789);
		System.out.println("C-) O número da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountNumber() + ".");	
		
		Client firstClient = new Client();
		firstAccount.setAccountClient(firstClient);
		
		firstAccount.getAccountClient().setClientName("Donatello");
		System.out.println("E-) O nome do titular da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountClient().getClientName() + ".");	

		firstAccount.depositValue(150);		
		firstAccount.withdrawValue(50);
		
		System.out.println();
		
		Account secondAccount = new Account();
		
		secondAccount.setAccountNickname("Segunda Conta");
		System.out.println("A-) O apelido da conta é " + secondAccount.getAccountNickname() + ".");
		
		secondAccount.setAccountAgency(654321);
		System.out.println("B-) A agência da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountAgency() + ".");	
		
		secondAccount.setAccountNumber(234567891);
		System.out.println("C-) O número da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountNumber() + ".");	
		
		Client secondClient = new Client();
		secondAccount.setAccountClient(secondClient);
		
		secondAccount.getAccountClient().setClientName("Leonardo");
		System.out.println("E-) O nome do titular da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountClient().getClientName() + ".");	

		secondAccount.depositValue(150);				
		firstAccount.transferValue(50, secondAccount);	
		
		System.out.println();
		
		System.out.println("D-) O saldo atual da " + firstAccount.getAccountNickname() + " é R$ " + firstAccount.getAccountBalance() + ".");
		System.out.println("D-) O saldo atual da " + secondAccount.getAccountNickname() + " é R$ " + secondAccount.getAccountBalance() + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
