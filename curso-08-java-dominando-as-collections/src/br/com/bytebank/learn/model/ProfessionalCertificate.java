// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code ProfessionalCertificate}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class ProfessionalCertificate {

	private List<Course> courses = new ArrayList<Course>();
	private Set<Student> students = new HashSet<Student>();
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
	 * Provê o método que obtém o valor total do atributo {@code durationOfTheCourse} de instâncias do tipo {@code Course}.
	 * 
	 * @return this.courses.stream().mapToDouble(Course::getDurationOfTheCourse).sum()
	 *         Retorna o valor total do atributo {@code durationOfTheCourse} de instâncias do tipo {@code Course}.
	 */
	public double getDurationOfTheProfessionalCertificate() {
		return this.courses.stream().mapToDouble(Course::getDurationOfTheCourse).sum();
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code courses} do objeto atual.
	 * 
	 * @return Collections.unmodifiableList(courses)
	 *         Retorna o valor do atributo de classe {@code courses}.
	 */
	public List<Course> getCourses() {
		return Collections.unmodifiableList(courses);
	}
	
	/**
	 * Provê o método de classe que obtém o valor do atributo de classe {@code students} do objeto atual.
	 * 
	 * @return Collections.unmodifiableSet(students)
	 *         Retorna o valor do atributo de classe {@code students}.
	 */
	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(students);
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
	 * Provê o método de classe que obtém o valor do atributo de classe {@code student} do objeto atual.
	 * 
	 * @param student
	 * 				O parâmetro que define o valor do atributo de classe {@code student}.
	 * 
	 * @return this.students.contains(student)
	 *         Retorna o valor do atributo de classe {@code students} em comparação a outro valor do atributo de classe {@code students}.
	 */
	public boolean search(Student student) {
		return this.students.contains(student);
	}
	
	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code courses} do objeto atual.
	 * 
	 * @param course
	 * 				O parâmetro que define o valor do atributo de classe {@code courses}.
	 */
	public void add(Course course) {
		this.courses.add(course);
	}
	
	/**
	 * Provê o método de classe que define o valor do atributo de classe {@code students} do objeto atual.
	 * 
	 * @param student
	 * 				O parâmetro que define o valor do atributo de classe {@code students}.
	 */
	public void register(Student student) {
		this.students.add(student);
	}
	
	@Override
	public String toString() {
		return "[Certificado Profissional: " + this.getTitle() + "; " + "Duração: " + this.getDurationOfTheProfessionalCertificate() + " minutos.]"; 
	}
}
