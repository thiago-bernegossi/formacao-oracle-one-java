// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code Account}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public abstract class Account implements Comparable<Account> {

	private double accountBalance;
	private int accountAgency;
	private int accountNumber;
	private Client accountClient;
	private String accountNickname;
	private static int amountOfBankAccounts;

	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code Account}.
	 * 
	 * @param accountNickname
	 * 				O atributo de classe que armazena o apelido do objeto atual.
	 * 
	 * @param accountAgency
	 * 				O atributo de classe que armazena a agência do objeto atual.
	 * 
	 * @param accountNumber
	 * 				O atributo de classe que armazena o número do objeto atual.
	 */
	public Account(String accountNickname, int accountAgency, int accountNumber) {
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

			Account.amountOfBankAccounts++;
		}
	}

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code accountBalance} do objeto atual.
	 * 
	 * @return this.accountBalance
	 *         Retorna o valor do atributo de classe {@code accountBalance}.
	 */
	public double getAccountBalance() {
		return this.accountBalance;
	}

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code accountAgency} do objeto atual.
	 * 
	 * @return this.accountAgency
	 *         Retorna o valor do atributo de classe {@code accountAgency}.
	 */
	public int getAccountAgency() {
		return this.accountAgency;
	}

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code accountNumber} do objeto atual.
	 * 
	 * @return this.accountNumber
	 *         Retorna o valor do atributo de classe {@code accountNumber}.
	 */
	public int getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code accountClient} do objeto atual.
	 * 
	 * @return this.accountClient
	 *         Retorna o valor do atributo de classe {@code accountClient}.
	 */
	public Client getAccountClient() {
		return this.accountClient;
	}

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code accountNickname} do objeto atual.
	 * 
	 * @return this.accountNickname
	 *         Retorna o valor do atributo de classe {@code accountNickname}.
	 */
	public String getAccountNickname() {
		return this.accountNickname;
	}

	/**
	 * Provê o método estático que obtém o valor do atributo estático {@code amountOfBankAccounts} de instâncias do tipo {@code Account}.
	 * 
	 * @return Account.amountOfBankAccounts
	 *         Retorna o valor do atributo estático {@code amountOfBankAccounts}.
	 */
	public static int getAmountOfBankAccounts() {
		return Account.amountOfBankAccounts;
	}

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code accountClient} do objeto atual.
	 * 
	 * @param accountClient
	 * 				O parâmetro que refere uma instância de um objeto do tipo {@code Client} e define o valor do atributo de classe {@code accountClient}.
	 */
	public void setAccountClient(Client accountClient) {
		this.accountClient = accountClient;
	}

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code accountNickname} do objeto atual.
	 * 
	 * @param accountNickname
	 * 				O parâmetro que define o valor do atributo de classe {@code accountNickname}.
	 */
	public void setAccountNickname(String accountNickname) {
		this.accountNickname = accountNickname;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account account = (Account) obj;
		if (this.getAccountNickname() == account.getAccountNickname()
				&& this.getAccountAgency() == account.getAccountAgency()
				&& this.getAccountNumber() == account.getAccountNumber()) {
			System.out.println("--- OPERAÇÃO DE COMPARAÇÃO DE CONTAS ---");
			System.out.println("A operação de comparação de contas fora realizada.");
			System.out.println("Os parâmetros (apelido, agência e número) foram analizados.");
			System.out.println("Obs.: Os parâmetros das contas são iguais.\n");
			return true;
		} else {
			System.out.println("--- OPERAÇÃO DE COMPARAÇÃO DE CONTAS ---");
			System.out.println("A operação de comparação de contas fora realizada.");
			System.out.println("Os parâmetros (apelido, agência e número) foram analizados.");
			System.out.println("Obs.: Os parâmetros das contas não são iguais.\n");
			return false;
		}
	}
	
	@Override
	public int compareTo(Account account) {
		return Double.compare(this.accountNumber, account.accountNumber);
	}
	
	@Override
	public String toString() {
		return "O apelido da conta é " + this.getAccountNickname() + ".\n"
					 + "A agência da " + this.getAccountNickname() + " é " +	this.getAccountAgency() + ".\n"
					 + "O número da " + this.getAccountNickname() + " é " + this.getAccountNumber() + ".\n";
	}

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code accountBalance} do objeto atual.
	 * 
	 * @param value
	 * 				O parâmetro que define o valor do atributo de classe {@code accountBalance}.
	 */
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

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code accountBalance} do objeto atual.
	 * 
	 * @param value
	 * 				O parâmetro que define o valor do atributo de classe {@code accountBalance}.
	 *
	 * @param destinationAccount
	 * 				O parâmetro que refere uma instância de um objeto do tipo {@code Account}.
	 */
	public void transferValue(double value, Account destinationAccount) {
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

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code accountBalance} do objeto atual.
	 * 
	 * @param value
	 * 				O parâmetro que define o valor do atributo de classe {@code accountBalance}.
	 */
	public void withdrawValue(double value) {
		if (this.accountBalance < value) {
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			throw new UncheckedException("A operação de saque de R$ " + value + " não fora realizada.");
		} else {
			this.accountBalance -= value;
			System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
			System.out.println("A operação de saque de R$ " + value + " fora realizada.");
		}
	}
}
