// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

import java.util.Comparator;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code ClientNameComparator}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class ClientNameComparator implements Comparator<Account> {

	@Override
	public int compare(Account firstAccount, Account secondAccount) {
		String firstClientName = firstAccount.getAccountClient().getClientName();
		String secondClientName = secondAccount.getAccountClient().getClientName();
		return firstClientName.compareTo(secondClientName);
	}
}
