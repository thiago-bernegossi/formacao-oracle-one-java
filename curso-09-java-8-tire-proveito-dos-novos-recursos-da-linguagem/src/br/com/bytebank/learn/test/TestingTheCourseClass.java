// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import br.com.bytebank.learn.model.Course;

public class TestingTheCourseClass {

	public static void main(String[] args) {
		List<Course> courses = new ArrayList<Course>();		
				
		courses.add(new Course("Matemática Financeira", 125));
		courses.add(new Course("Administração", 100));
		courses.add(new Course("Economia", 75));
		courses.add(new Course("Contabilidade", 50));
		
		courses.sort(Comparator.comparingInt(Course::getNumberOfRegistrations));
		
		OptionalDouble average = courses.stream()
				.filter(course -> course.getNumberOfRegistrations() >= 100)
				.mapToInt(Course::getNumberOfRegistrations)
				.average();
		
		System.out.println("A-) A média de matrículas em cursos com 100 ou mais matrículas é: " + average.getAsDouble() + ".\n");
		
		courses.stream()
				.filter(course -> course.getNumberOfRegistrations() >= 100)
				.findAny()
				.ifPresent(course -> System.out.println("B-) Um dos cursos com 100 ou mais matrículas é: " + course.getTitle() + ".\n"));
	
		courses.stream()
				.filter(course -> course.getNumberOfRegistrations() >= 100)
				.collect(Collectors.toMap(
						course -> course.getTitle(),
						course -> course.getNumberOfRegistrations()))
				.forEach((title, numberOfRegistrations) -> System.out.println("C-) Um dos cursos com 100 ou mais matrículas é: \n[Curso: " + title + "; " + "Matrículas: " + numberOfRegistrations + ".]\n")); 
	}
}
