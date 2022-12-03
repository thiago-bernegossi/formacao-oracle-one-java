// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Account {
	private double accountBalance;
	private int accountAgency;
	private int accountNumber;
	private Client accountClient;
	private String accountNickname;
	
	public Account(String accountNickname, int accountAgency, int accountNumber) {
		if (accountNickname == " " || accountNickname == "" || accountAgency != 654321 || accountNumber <= 0) {
			System.out.println("--- OPERAÇÃO DE ABERTURA DE CONTA ---");
			System.out.println("A operação de abertura de conta não fora realizada.\n");
			return;
		} else {
			this.accountNickname = accountNickname;
			this.accountAgency = accountAgency;
			this.accountNumber = accountNumber;
			System.out.println("--- OPERAÇÃO DE ABERTURA DE CONTA ---");
			System.out.println("A operação de abertura de conta fora realizada.\n");
		}
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public int getAccountAgency() {
		return this.accountAgency;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}

	public Client getAccountClient() {
		return this.accountClient;
	}

	public String getAccountNickname() {
		return this.accountNickname;
	}
	
	public void setAccountClient(Client accountClient) {
		this.accountClient = accountClient;
	}
	
	public void setAccountNickname(String accountNickname) {
		this.accountNickname = accountNickname;
	}

	public void withdrawValue(double value) {
		if (this.accountBalance >= value) {
			this.accountBalance -= value;
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			System.out.println("A operação de saque de R$ " + value + " fora realizada.");
		} else {
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			System.out.println("A operação de saque de R$ " + value + " não fora realizada.");
		}
	}

	public void depositValue(double value) {
		if (value >= 1) {
			this.accountBalance += value;
			System.out.println("\n--- OPERAÇÃO DE DEPÓSITO ---");
			System.out.println("A operação de depósito de R$ " + value + " fora realizada.");
		} else {
			System.out.println("\n--- OPERAÇÃO DE DEPÓSITO ---");
			System.out.println("A operação de depósito de R$ " + value + " não fora realizada.");
		}
	}

	public void transferValue(double value, Account destinationAccount) {
		if (this.accountBalance >= value) {
			this.accountBalance -= value;
			destinationAccount.accountBalance += value;
			System.out.println("\n--- OPERAÇÃO DE TRANSFERÊNCIA ---");
			System.out.println("A operação de transferência de R$ " + value + " fora realizada.");
		} else {
			System.out.println("\n--- OPERAÇÃO DE TRANSFERÊNCIA ---");
			System.out.println("A operação de transferência de R$ " + value + " não fora realizada.");
		}
	}
}
