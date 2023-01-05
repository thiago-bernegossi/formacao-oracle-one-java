// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code Student}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class Student {
	
	private int registration;
	private String name;
	
	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code Student}.
	 * 
	 * @param name
	 * 				O parâmetro que define o valor do atributo de classe {@code name}.
	 * 
	 * @param registration
	 * 				O parâmetro que define o valor do atributo de classe {@code registration}.
	 */
	public Student(String name, int registration) {
		this.name = name;
		this.registration = registration;
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code registration} do objeto atual.
	 * 
	 * @return this.registration
	 *         Retorna o valor do atributo de classe {@code registration}.
	 */
	public int getRegistration() {
		return this.registration;
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code name} do objeto atual.
	 * 
	 * @return this.name
	 *         Retorna o valor do atributo de classe {@code name}.
	 */
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.getName() + "; " + "Matrícula: " + this.getRegistration() + ".]"; 
	}
}
