// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package test;

public class TestingCallStack {

	public static void main(String[] args) {
		System.out.println("Início da execução do método main.");

		try {
			firstMethod();
		} catch (Exception exception) {
			System.out.println("--- OPERAÇÃO DE TRATAMENTO DE EXCEÇÃO ---");
			exception.printStackTrace();
		}

		System.out.println("\nFinal da execução do método main.");
	}

	private static void firstMethod() throws model.CheckedException {
		System.out.println("Início da execução do método firstMethod.");

		secondMethod();

		System.out.println("Final da execução do método firstMethod.");
	}

	private static void secondMethod() throws model.CheckedException {
		System.out.println("Início da execução do método secondMethod.\n");

		throw new model.CheckedException();
		
		// System.out.println("Final da execução do método secondMethod.");
	}
}
