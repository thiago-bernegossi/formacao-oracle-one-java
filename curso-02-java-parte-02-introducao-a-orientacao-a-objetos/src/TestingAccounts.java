// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingAccounts {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account thirdAccount = new Account();
		thirdAccount.accountClient = new Client();
		
		thirdAccount.setAccountNickname("Terceira Conta");
		System.out.println("A-) O apelido da conta é " + thirdAccount.getAccountNickname() + ".");
		
		thirdAccount.setAccountAgency(654321);
		System.out.println("B-) A agência da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountAgency() + ".");	
		
		thirdAccount.setAccountNumber(345678912);
		System.out.println("C-) O número da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountNumber() + ".");	
		
		thirdAccount.accountClient.clientName = "Michelangelo";
		System.out.println("E-) O nome do titular da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.accountClient.clientName + ".");	
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
