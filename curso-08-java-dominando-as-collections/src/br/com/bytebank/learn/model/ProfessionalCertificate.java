// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code ProfessionalCertificate}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class ProfessionalCertificate {

	private List<Course> courses = new ArrayList<Course>();
	private String instructor;
	private String title;

	/**
	 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code ProfessionalCertificate}.
	 *
	 * @param title
	 * 				O parâmetro que define o valor do atributo de classe {@code title}.
	 *
	 * @param instructor
	 * 				O parâmetro que define o valor do atributo de classe {@code instructor}.
	 */
	public ProfessionalCertificate(String title, String instructor) {
		this.title = title;
		this.instructor = instructor;
	}

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code courses} do objeto atual.
	 * 
	 * @return this.courses
	 *         Retorna o valor do atributo de classe {@code courses}.
	 */
	public List<Course> getCourses() {
		return Collections.unmodifiableList(courses);
	}

	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code instructor} do objeto atual.
	 * 
	 * @return this.instructor
	 *         Retorna o valor do atributo de classe {@code instructor}.
	 */
	public String getInstructor() {
		return this.instructor;
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

	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code course} do objeto atual.
	 * 
	 * @param course
	 * 				O parâmetro que define o valor do atributo de classe {@code course}.
	 */
	public void add(Course course) {
		this.courses.add(course);
	}
}
