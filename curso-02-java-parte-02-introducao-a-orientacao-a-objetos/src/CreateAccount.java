// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class CreateAccount {

	public static void main(String[] args) {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account firstAccount = new Account();
		
		firstAccount.accountNickname = "Primeira Conta";
		System.out.println("A-) O apelido da Conta é " + firstAccount.accountNickname + ".");
		
		System.out.println("B-) A agência da " + firstAccount.accountNickname + " é " + firstAccount.accountAgency + ".");	
		
		firstAccount.accountNumber = 123456789;
		System.out.println("C-) O número da " + firstAccount.accountNickname + " é " + firstAccount.accountNumber + ".");	
		
		Client firstClient = new Client();		
		firstAccount.accountClient = firstClient;
		
		firstAccount.accountClient.clientName = "Donatello";
		System.out.println("E-) O nome do titular da " + firstAccount.accountNickname + " é " + firstAccount.accountClient.clientName + ".");	

		firstAccount.depositValue(150);		
		firstAccount.withdrawValue(50);
		
		System.out.println();
		
		Account secondAccount = new Account();
		
		secondAccount.accountNickname = "Segunda Conta";
		System.out.println("A-) O apelido da Conta é " + secondAccount.accountNickname + ".");
		
		System.out.println("B-) A agência da " + secondAccount.accountNickname + " é " + secondAccount.accountAgency + ".");	
		
		secondAccount.accountNumber = 234567891;
		System.out.println("C-) O número da " + secondAccount.accountNickname + " é " + secondAccount.accountNumber + ".");	
		
		Client secondClient = new Client();		
		secondAccount.accountClient = secondClient;
		
		secondAccount.accountClient.clientName = "Leonardo";
		System.out.println("E-) O nome do titular da " + secondAccount.accountNickname + " é " + secondAccount.accountClient.clientName + ".");	

		secondAccount.depositValue(150);				
		firstAccount.transferValue(50, secondAccount);	
		
		System.out.println();
		
		System.out.println("D-) O saldo atual da " + secondAccount.accountNickname + " é R$ " + secondAccount.accountBalance + ".");
		System.out.println("D-) O saldo atual da " + secondAccount.accountNickname + " é R$ " + secondAccount.accountBalance + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
