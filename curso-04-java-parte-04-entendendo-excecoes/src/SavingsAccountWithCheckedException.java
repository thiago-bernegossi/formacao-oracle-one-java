// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class SavingsAccountWithCheckedException extends AccountWithCheckedException implements Taxable {

	public SavingsAccountWithCheckedException(String accountNickname, int accountAgency, int accountNumber) {
		super(accountNickname, accountAgency, accountNumber);
	}

	@Override
	public double taxAmount() {
		return super.getAccountBalance() * 0;
	}
	
	@Override
	public void transferValue(double value, AccountWithCheckedException destinationAccount) throws CheckedException  {
		double newValue = value;
		super.transferValue(newValue, destinationAccount);
	}
	
	@Override
	public void withdrawValue(double value) throws CheckedException {
		double newValue = value;
		super.withdrawValue(newValue);
	}
}
