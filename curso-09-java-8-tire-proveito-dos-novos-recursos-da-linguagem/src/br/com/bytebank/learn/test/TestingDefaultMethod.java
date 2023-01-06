// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.learn.model.CompareByStringLength;
import br.com.bytebank.learn.model.ConsumeString;

public class TestingDefaultMethod {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();

		students.add("Donatello");
		students.add("Leonardo");
		students.add("Michelangelo");
		students.add("Raphael");

		Comparator<String> comparator = new CompareByStringLength();

		// Processo de implementação do método default sort().
		students.sort(comparator);

		System.out.println("A-) Os alunos matriculados são: " + students + ".\n");

		Consumer<String> consumer = new ConsumeString();

		System.out.println("B-) Os alunos matriculados são: \n");

		// Processo de implementação do método default forEach().
		students.forEach(consumer);
	}
}
