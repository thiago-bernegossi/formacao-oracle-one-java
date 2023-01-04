// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.bytebank.learn.model.Course;

public class TestingCourseList {

	public static void main(String[] args) {
		ArrayList<Course> courses = new ArrayList<Course>();
		
		Course firstCourse = new Course("Matemática Financeira", 35);
		courses.add(firstCourse);
		
		Course secondCourse = new Course("Administração", 40);
		courses.add(secondCourse);
		
		Course thirdCourse = new Course("Economia", 45);
		courses.add(thirdCourse);
		
		Course fourthCourse = new Course("Contabilidade", 50);
		courses.add(fourthCourse);
		
		System.out.println(courses);
		
		// Processo de ordenação lexicográfica.
		Collections.sort(courses);
		
		System.out.println(courses);
		
		// Processo de ordenação numérica.
		Collections.sort(courses, Comparator.comparing(Course::getRuntime));
		
		System.out.println(courses);
		
		// Processo de ordenação numérica.
		courses.sort(Comparator.comparing(Course::getRuntime));
		
		System.out.println(courses);
	}
}
