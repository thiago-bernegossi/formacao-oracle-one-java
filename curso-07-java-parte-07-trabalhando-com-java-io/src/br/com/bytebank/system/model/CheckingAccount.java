// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

import java.io.Serializable;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code CheckingAccount}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class CheckingAccount extends Account implements Serializable, Taxable {

	private static final long serialVersionUID = 1L;

	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code CheckingAccount}.
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
	public CheckingAccount(String accountNickname, int accountAgency, int accountNumber) {
		super(accountNickname, accountAgency, accountNumber);
	}
	
	@Override
	public double taxAmount() {
		return super.getAccountBalance() * 0.0125;
	}
	
	@Override
	public String toString() {
		return "--- OPERAÇÃO DE ANÁLISE DE CONTA --- \n" + super.toString() + "Obs.: Conta do Tipo Corrente.\n";
	}
	
	@Override
	public void transferValue(double value, Account destinationAccount) {
		double newValue = value + 0.10;
		super.transferValue(newValue, destinationAccount);
	}
	
	@Override
	public void withdrawValue(double value) {
		double newValue = value + 0.10;
		super.withdrawValue(newValue);
	}
}
