// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Account {
	double accountBalance;
	int accountAgency = 654321;
	int accountNumber;
	Client accountClient;
	String accountNickname;
	
	public boolean withdrawValue(double value) {
		if (this.accountBalance >= value) {
			this.accountBalance -= value;
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			System.out.println("J-) A operação de saque de R$ " + value + " fora realizada.");
			return true;
		} else {
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			System.out.println("J-) A operação de saque de R$ " + value + " não fora realizada.");
			return false;
		}
	}
	
	public void depositValue(double value) {
		this.accountBalance += value;
		System.out.println("\n--- OPERAÇÃO DE DEPÓSITO ---");
		System.out.println("H-) A operação de depósito de R$ " + value + " fora realizada.");
	}
	
	public boolean transferValue(double value, Account destinationAccount) {
		if (this.accountBalance >= value) {
			this.accountBalance -= value;
			destinationAccount.accountBalance += value;
			System.out.println("\n--- OPERAÇÃO DE TRANSFERÊNCIA ---");
			System.out.println("I-) A operação de transferência de R$ " + value + " fora realizada.");
			return true;
		} else {			
			System.out.println("\n--- OPERAÇÃO DE TRANSFERÊNCIA ---");
			System.out.println("I-) A operação de transferência de R$ " + value + " não fora realizada.");
			return false;
		}
	}
}
