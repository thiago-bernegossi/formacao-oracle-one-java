// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code SavingsAccount}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class SavingsAccount extends Account implements Taxable {

	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code SavingsAccount}.
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
	public SavingsAccount(String accountNickname, int accountAgency, int accountNumber) {
		super(accountNickname, accountAgency, accountNumber);
	}

	@Override
	public double taxAmount() {
		return super.getAccountBalance() * 0;
	}
	
	@Override
	public String toString() {
		return "--- OPERAÇÃO DE ANÁLISE DE CONTA --- \n" + super.toString() + "Obs.: Conta do Tipo Poupança.\n";
	}
	
	@Override
	public void transferValue(double value, Account destinationAccount) {
		double newValue = value;
		super.transferValue(newValue, destinationAccount);
	}
	
	@Override
	public void withdrawValue(double value) {
		double newValue = value;
		super.withdrawValue(newValue);
	}
}
