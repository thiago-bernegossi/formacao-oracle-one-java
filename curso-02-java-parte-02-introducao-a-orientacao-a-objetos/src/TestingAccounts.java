// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingAccounts {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account thirdAccount = new Account();
		thirdAccount.accountClient = new Client();
		
		thirdAccount.accountNickname = "Terceira Conta";
		System.out.println("A-) O apelido da Conta é " + thirdAccount.accountNickname + ".");
		
		System.out.println("B-) A agência da " + thirdAccount.accountNickname + " é " + thirdAccount.accountAgency + ".");	
		
		thirdAccount.accountNumber = 345678912;
		System.out.println("C-) O número da " + thirdAccount.accountNickname + " é " + thirdAccount.accountNumber + ".");	
		
		thirdAccount.accountClient.clientName = "Michelangelo";
		System.out.println("E-) O nome do titular da " + thirdAccount.accountNickname + " é " + thirdAccount.accountClient.clientName + ".");	
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
