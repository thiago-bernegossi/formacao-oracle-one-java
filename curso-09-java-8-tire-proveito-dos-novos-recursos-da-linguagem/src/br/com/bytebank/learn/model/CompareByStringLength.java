// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.model;

import java.util.Comparator;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code CompareByStringLength}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class CompareByStringLength implements Comparator<String> {

	@Override
	public int compare(String firstString, String secondString) {
		if (firstString.length() < secondString.length()) {
			return -1;
		} else if (firstString.length() > secondString.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}
