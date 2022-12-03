import java.util.Iterator;

// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingGettersAndSetters {

	public static void main(String[] args) {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Account fourthAccount = new Account("Quarta Conta", 654321, 456789123);		
		System.out.println("O apelido da conta é " + fourthAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountNumber() + ".");	
		
		Client fourthClient = new Client();		
		fourthAccount.setAccountClient(fourthClient);		
		
		fourthAccount.getAccountClient().setClientName("Raphael");
		System.out.println("O nome do titular da " + fourthAccount.getAccountNickname() + " é " + fourthAccount.getAccountClient().getClientName() + ".");	
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
