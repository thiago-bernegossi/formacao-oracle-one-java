// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code Taxable}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public abstract interface Taxable {
	
	public abstract double taxAmount();	
}
