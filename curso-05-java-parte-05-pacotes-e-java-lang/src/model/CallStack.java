// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package model;

public class CallStack {

	public static void main(String[] args) {
		System.out.println("Início da execução do método main.");

		firstMethod();
		
		System.out.println("Final da execução do método main.");
	}

	private static void firstMethod() {
		System.out.println("Início da execução do método firstMethod.");

		secondMethod();

		System.out.println("Final da execução do método firstMethod.");
	}

	private static void secondMethod() {
		System.out.println("Início da execução do método secondMethod.\n");

		for (int counter = 0; counter <= 10; counter++) {
			System.out.println(counter);
		}

		System.out.println("\nFinal da execução do método secondMethod.");
	}
}
