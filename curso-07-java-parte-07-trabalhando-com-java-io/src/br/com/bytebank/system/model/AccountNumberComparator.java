// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

import java.util.Comparator;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code AccountNumberComparator}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class AccountNumberComparator implements Comparator<Account> {

	@Override
	public int compare(Account firstAccount, Account secondAccount) {
		return Integer.compare(firstAccount.getAccountNumber(), secondAccount.getAccountNumber());
	}
}
