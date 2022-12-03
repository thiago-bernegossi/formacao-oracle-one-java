// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingAccounts {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account thirdAccount = new Account("Terceira Conta", 654321, 345678912);				
		System.out.println("O apelido da conta é " + thirdAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountNumber() + ".");	
		
		Client thirdClient = new Client();
		thirdAccount.setAccountClient(thirdClient);
		
		thirdAccount.getAccountClient().setClientName("Michelangelo");
		System.out.println("O nome do titular da " + thirdAccount.getAccountNickname() + " é " + thirdAccount.getAccountClient().getClientName() + ".");	
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
