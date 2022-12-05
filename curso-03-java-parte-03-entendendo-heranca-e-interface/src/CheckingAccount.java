// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class CheckingAccount extends Account {

	public CheckingAccount(String accountNickname, int accountAgency, int accountNumber) {
		super(accountNickname, accountAgency, accountNumber);
	}
	
	@Override
	public void withdrawValue(double value) {
		double newValue = value + 0.10;
		super.withdrawValue(newValue);
	}
	
	@Override
	public void transferValue(double value, Account destinationAccount) {
		double newValue = value + 0.10;
		super.transferValue(newValue, destinationAccount);
	}
}
