// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.model;

import java.util.function.Consumer;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code ConsumeString}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class ConsumeString implements Consumer<String> {

	@Override
	public void accept(String string) {
		System.out.println(string + ".");
	}
}
