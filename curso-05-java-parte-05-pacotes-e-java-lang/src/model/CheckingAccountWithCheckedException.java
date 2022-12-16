// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package model;

public class CheckingAccountWithCheckedException extends AccountWithCheckedException implements Taxable {

	public CheckingAccountWithCheckedException(String accountNickname, int accountAgency, int accountNumber) {
		super(accountNickname, accountAgency, accountNumber);
	}
	
	@Override
	public double taxAmount() {
		return super.getAccountBalance() * 0.0125;
	}
	
	@Override
	public void transferValue(double value, AccountWithCheckedException destinationAccount) throws CheckedException {
		double newValue = value + 0.10;
		super.transferValue(newValue, destinationAccount);
	}
	
	@Override
	public void withdrawValue(double value) throws CheckedException {
		double newValue = value + 0.10;
		super.withdrawValue(newValue);
	}
}
