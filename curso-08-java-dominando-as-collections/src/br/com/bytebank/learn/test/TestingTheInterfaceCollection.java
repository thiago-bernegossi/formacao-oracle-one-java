// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Collection;

public class TestingTheInterfaceCollection {

	public static void main(String[] args) {
		Collection<String> students = new ArrayList<String>();
		
		students.add("Donatello");
		students.add("Leonardo");
		students.add("Michelangelo");
		students.add("Raphael");
		
		System.out.println("A-) A quantidade de alunos matriculados é: " + students.size() + ".\n");
		
		System.out.println("B-) Os alunos matriculados são: " + students + ".\n");
		
		boolean isEnrolled = students.contains("Paollo");
		System.out.println("C-) O aluno Paollo está matriculado: " + isEnrolled + ".\n");
		
		students.add("Paollo");
		
		System.out.println("D-) Os alunos matriculados são:");
		
		for (String student : students) {
			System.out.println(student + ".");
		}
		
		students.remove("Paollo");
		
		System.out.println();

		System.out.println("E-) Os alunos matriculados são:");
		
		students.forEach(student -> {
			System.out.println(student + ".");
		});
	}
}
