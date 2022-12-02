import java.util.Iterator;

// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingGettersAndSetters {

	public static void main(String[] args) {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account fourthAccount = new Account();
		
		fourthAccount.setAccountNickname("Quarta Conta");
		System.out.println("A-) O apelido da conta é " + fourthAccount.getAccountNickname() + ".");
		
		fourthAccount.setAccountAgency(654321);
		System.out.println("B-) A agência da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountAgency() + ".");	
		
		fourthAccount.setAccountNumber(456789123);
		System.out.println("C-) O número da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountNumber() + ".");	
		
		Client fourthClient = new Client();		
		fourthAccount.setAccountClient(fourthClient);		
		
		fourthAccount.getAccountClient().setClientName("Raphael");
		System.out.println("E-) O nome do titular da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountClient().getClientName() + ".");	
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
