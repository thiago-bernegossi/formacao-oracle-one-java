// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.learn.model.Course;

public class TestingTheCourseClass {

	public static void main(String[] args) {
		List<Course> courses = new ArrayList<Course>();		
				
		courses.add(new Course("Matemática Financeira", 125));
		courses.add(new Course("Administração", 100));
		courses.add(new Course("Economia", 75));
		courses.add(new Course("Contabilidade", 50));
		
		courses.sort(Comparator.comparingInt(Course::getNumberOfRegistrations));
		
		System.out.println(courses);
		
		System.out.println();
		
		int numberOfRegistrations = courses.stream()
				.filter(course -> course.getNumberOfRegistrations() >= 100)
				.mapToInt(Course::getNumberOfRegistrations).sum();
		
		System.out.println("A-) O total de alunos matriculados em cursos com mais de 100 matrículas é: " + numberOfRegistrations + ".\n");
	}
}
