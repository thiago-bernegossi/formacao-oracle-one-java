// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code Course}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class Course {
	
	private int numberOfRegistrations;
	private String title;
	
	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code Course}.
	 * 
	 * @param title
	 * 				O parâmetro que define o valor do atributo de classe {@code title}.
	 * 
	 * @param numberOfRegistrations
	 * 				O parâmetro que define o valor do atributo de classe {@code numberOfRegistrations}.
	 */
	public Course(String title, int numberOfRegistrations) {
		this.numberOfRegistrations = numberOfRegistrations;
		this.title = title;
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code numberOfRegistrations} do objeto atual.
	 * 
	 * @return this.numberOfRegistrations
	 *         Retorna o valor do atributo de classe {@code numberOfRegistrations}.
	 */
	public int getNumberOfRegistrations() {
		return this.numberOfRegistrations;
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code title} do objeto atual.
	 * 
	 * @return this.title
	 *         Retorna o valor do atributo de classe {@code title}.
	 */
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getTitle() + "; " + "Matrículas: " + this.getNumberOfRegistrations() + ".]"; 
	}
}
