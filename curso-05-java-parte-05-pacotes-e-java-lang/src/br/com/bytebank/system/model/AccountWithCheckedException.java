// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

public abstract class AccountWithCheckedException {

	private double accountBalance;
	private int accountAgency;
	private int accountNumber;
	private Client accountClient;
	private String accountNickname;
	private static int amountOfBankAccounts;

	public AccountWithCheckedException(String accountNickname, int accountAgency, int accountNumber) {
		if (accountNickname == " " || accountNickname == "" || accountAgency != 654321 || accountNumber <= 0) {
			System.out.println("--- OPERAÇÃO DE ABERTURA DE CONTA ---");
			System.out.println("A operação de abertura da conta não fora realizada.\n");
			return;
		} else {
			this.accountNickname = accountNickname;
			this.accountAgency = accountAgency;
			this.accountNumber = accountNumber;
			System.out.println("--- OPERAÇÃO DE ABERTURA DE CONTA ---");
			System.out.println("A operação de abertura da conta fora realizada.\n");

			AccountWithCheckedException.amountOfBankAccounts++;
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

	public static int getAmountOfBankAccounts() {
		return AccountWithCheckedException.amountOfBankAccounts;
	}

	public void setAccountClient(Client accountClient) {
		this.accountClient = accountClient;
	}

	public void setAccountNickname(String accountNickname) {
		this.accountNickname = accountNickname;
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

	public void transferValue(double value, AccountWithCheckedException destinationAccount) throws CheckedException {
		if (this.accountBalance < value) {
			System.out.println("\n--- OPERAÇÃO DE TRANSFERÊNCIA ---");
			throw new UncheckedException("A operação de transferência de R$ " + value + " não fora realizada.");
		} else {
			this.withdrawValue(value);
			destinationAccount.depositValue(value);
			System.out.println("\n--- OPERAÇÃO DE TRANSFERÊNCIA ---");
			System.out.println("A operação de transferência de R$ " + value + " fora realizada.");
		}
	}

	public void withdrawValue(double value) throws CheckedException {
		if (this.accountBalance < value) {
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			throw new CheckedException("A operação de saque de R$ " + value + " não fora realizada.");
		} else {
			this.accountBalance -= value;
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			System.out.println("A operação de saque de R$ " + value + " fora realizada.");
		}
	}
}
