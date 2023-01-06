// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.List;

public class TestingLambdaExpression {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();

		students.add("Donatello");
		students.add("Leonardo");
		students.add("Michelangelo");
		students.add("Raphael");

		System.out.println("A-) Os alunos matriculados são: \n");

		// Processo de conversão de uma expressão lambda para uma interface funcional.
		students.sort((firstStudent, secondStudent) -> Integer.compare(firstStudent.length(), secondStudent.length()));

		System.out.println(students);
		
		System.out.println();
		
		System.out.println("B-) Os alunos matriculados são: \n");
		
		// Processo de utilização de uma expressão lambda.
		students.forEach(student -> System.out.println(student));
	}
}
