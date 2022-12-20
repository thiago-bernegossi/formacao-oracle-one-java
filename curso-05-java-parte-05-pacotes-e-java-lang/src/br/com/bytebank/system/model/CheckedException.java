// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code CheckedException}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class CheckedException extends Exception {

	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code CheckedException}.
	 */
	public CheckedException() {
		super();
	}
	
	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code CheckedException}.
	 * 
	 * @param message
	 * 				O parâmetro que define o valor do atributo de classe {@code detailMessage}.
	 */
	public CheckedException(String message) {
		super(message);
	}
}
