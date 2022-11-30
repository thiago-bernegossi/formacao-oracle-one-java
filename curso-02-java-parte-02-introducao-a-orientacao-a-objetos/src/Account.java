// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Account {
	double accountBalance;
	int accountAgency = 6543210;
	int accountNumber;
	String accountOwner;
	String accountNickname;
	
	public void depositValue(double value) {
		this.accountBalance += value;
	}
}
