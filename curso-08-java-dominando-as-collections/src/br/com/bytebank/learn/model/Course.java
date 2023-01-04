// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code Course}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class Course implements Comparable<Course> {
	
	private double durationOfTheCourse;
	private String title;
	
	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code Course}.
	 * 
	 * @param title
	 * 				O parâmetro que define o valor do atributo de classe {@code title}.
	 * 
	 * @param durationOfTheCourse
	 * 				O parâmetro que define o valor do atributo de classe {@code durationOfTheCourse}.
	 */
	public Course(String title, double durationOfTheCourse) {
		this.durationOfTheCourse = durationOfTheCourse;
		this.title = title;
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code durationOfTheCourse} do objeto atual.
	 * 
	 * @return this.durationOfTheCourse
	 *         Retorna o valor do atributo de classe {@code durationOfTheCourse}.
	 */
	public double getDurationOfTheCourse() {
		return this.durationOfTheCourse;
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
	public int compareTo(Course anotherCourse) {
		return this.getTitle().compareTo(anotherCourse.getTitle());
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getTitle() + "; " + "Duração: " + this.getDurationOfTheCourse() + " minutos.]"; 
	}
}
