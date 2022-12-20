// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code CheckingAccountWithUncheckedException}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class CheckingAccountWithUncheckedException extends AccountWithUncheckedException implements Taxable {

	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code CheckingAccountWithUncheckedException}.
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
	public CheckingAccountWithUncheckedException(String accountNickname, int accountAgency, int accountNumber) {
		super(accountNickname, accountAgency, accountNumber);
	}
	
	@Override
	public double taxAmount() {
		return super.getAccountBalance() * 0.0125;
	}
	
	@Override
	public void transferValue(double value, AccountWithUncheckedException destinationAccount) {
		double newValue = value + 0.10;
		super.transferValue(newValue, destinationAccount);
	}
	
	@Override
	public void withdrawValue(double value) {
		double newValue = value + 0.10;
		super.withdrawValue(newValue);
	}
}
