// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class SavingsAccount extends Account implements Taxable {

	public SavingsAccount(String accountNickname, int accountAgency, int accountNumber) {
		super(accountNickname, accountAgency, accountNumber);
	}

	@Override
	public double taxAmount() {
		return super.getAccountBalance() * 0;
	}
}
