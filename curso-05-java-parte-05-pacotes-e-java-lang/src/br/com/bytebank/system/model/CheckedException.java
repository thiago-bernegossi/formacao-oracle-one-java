// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

public class CheckedException extends Exception {

	public CheckedException() {
		super();
	}
	
	public CheckedException(String message) {
		super(message);
	}
}
