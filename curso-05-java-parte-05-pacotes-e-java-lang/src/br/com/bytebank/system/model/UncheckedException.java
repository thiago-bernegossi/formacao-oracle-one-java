// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

public class UncheckedException extends RuntimeException {

	public UncheckedException() {
		super();
	}
	
	public UncheckedException(String message) {
		super(message);
	}
}
