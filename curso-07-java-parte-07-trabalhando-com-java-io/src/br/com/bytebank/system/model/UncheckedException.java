// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

import java.io.Serializable;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code UncheckedException}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class UncheckedException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code UncheckedException}.
	 */
	public UncheckedException() {
		super();
	}
	
	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code UncheckedException}.
	 * 
	 * @param message
	 * 				O parâmetro que define o valor do atributo de classe {@code detailMessage}.
	 */
	public UncheckedException(String message) {
		super(message);
	}
}
