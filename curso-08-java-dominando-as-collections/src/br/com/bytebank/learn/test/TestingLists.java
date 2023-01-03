// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Collections;

public class TestingLists {

	public static void main(String[] args) {
		ArrayList<String> courses = new ArrayList<String>();
		
		String firstCourse = "Matemática Financeira";
		courses.add(firstCourse);
		
		String secondCourse = "Administração";
		courses.add(secondCourse);
		
		String thirdCourse = "Economia";
		courses.add(thirdCourse);
		
		String fourthCourse = "Contabilidade";
		courses.add(fourthCourse);
		
		System.out.println("A-) Os cursos do ByteBank Learn são: " + courses + ".\n");
		
		courses.remove(3);
		
		System.out.println("B-) Os cursos do ByteBank Learn são: " + courses + ".\n");
		
		for (String course : courses) {
			System.out.println("C-) Curso: " + course + ".\n");
		}

		System.out.println("D-) O primeiro curso do ByteBank Learn é: " + courses.get(0)+ ".\n");
		
		for (int counter = 0; counter < courses.size(); counter++) {
			System.out.println("E-) Curso: " + courses.get(counter) + ".\n");
		}
		
		System.out.println("F-) A quantidade de cursos do ByteBank Learn é: " + courses.size() + ".\n");
		
		courses.forEach(course -> {
			System.out.println("G-) Curso: " + course + ".\n");
		});
		
		courses.add(fourthCourse);
		
		System.out.println("H-) A quantidade de cursos do ByteBank Learn é: " + courses.size() + ".\n");
		
		Collections.sort(courses);
		
		courses.forEach(course -> {
			System.out.println("I-) Os cursos do ByteBank Learn são: " + course + ".\n");
		});
	}
}
