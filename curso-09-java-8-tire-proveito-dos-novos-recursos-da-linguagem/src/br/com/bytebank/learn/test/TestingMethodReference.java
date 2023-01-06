// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestingMethodReference {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();

		students.add("Donatello");
		students.add("Leonardo");
		students.add("Michelangelo");
		students.add("Raphael");

		System.out.println("A-) Os alunos matriculados são: \n");

		// Processo de utilização de uma referência de método.
		students.sort(Comparator.comparing(string -> string.length()));

		System.out.println(students);

		System.out.println();

		System.out.println("B-) Os alunos matriculados são: \n");

		students.sort(Comparator.comparing(String::length));

		System.out.println(students);

		System.out.println();

		System.out.println("C-) Os alunos matriculados são: \n");

		students.forEach(System.out::println);
	}
}
