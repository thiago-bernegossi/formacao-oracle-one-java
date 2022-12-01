// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Account {
	double accountBalance;
	int accountAgency = 6543210;
	int accountNumber;
	String accountOwner;
	String accountNickname;
	
	public Boolean withdrawValue(double value) {
		if (this.accountBalance >= value) {
			this.accountBalance -= value;
			System.out.println("C-) A operação de saque de R$ " + value + " fora realizada.");
			System.out.println("D-) O saldo atual da " + this.accountNickname + " é R$ " + this.accountBalance + ".");
			return true;
		} else {
			System.out.println("C-) A operação de saque de R$ " + value + " não fora realizada.");
			System.out.println("D-) O saldo atual da " + this.accountNickname + " é R$ " + this.accountBalance + ".");
			return false;
		}
	}
	
	public void depositValue(double value) {
		this.accountBalance += value;
	}
}
