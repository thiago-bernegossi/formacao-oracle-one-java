// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code Client}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class Client {
	
	private String clientItr;
	private String clientLastName;
	private String clientName;

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code clientItr} do objeto atual.
	 * 
	 * @return this.clientItr
	 *         Retorna o valor do atributo de classe {@code clientItr}.
	 */
	public String getClientItr() {
		return this.clientItr;
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code clientLastName} do objeto atual.
	 * 
	 * @return this.clientLastName
	 *         Retorna o valor do atributo de classe {@code clientLastName}.
	 */
	public String getClientLastName() {
		return this.clientLastName;
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code clientName} do objeto atual.
	 * 
	 * @return this.clientName
	 *         Retorna o valor do atributo de classe {@code clientName}.
	 */
	public String getClientName() {
		return this.clientName;
	}

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code clientItr} do objeto atual.
	 * 
	 * @param clientItr
	 * 				O parâmetro que define o valor do atributo de classe {@code clientItr}.
	 */
	public void setClientItr(String clientItr) {
		this.clientItr = clientItr;
	}

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code clientLastName} do objeto atual.
	 * 
	 * @param clientLastName
	 * 				O parâmetro que define o valor do atributo de classe {@code clientLastName}.
	 */
	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code clientName} do objeto atual.
	 * 
	 * @param clientName
	 * 				O parâmetro que define o valor do atributo de classe {@code clientName}.
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
}
