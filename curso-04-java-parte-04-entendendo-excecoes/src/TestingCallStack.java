//Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingCallStack {

	public static void main(String[] args) {
		System.out.println("Início da execução do método main.");

		try {
			firstMethod();
		} catch (ArithmeticException | ExampleException | NullPointerException exception) {
			System.out.println("--- OPERAÇÃO DE TRATAMENTO DE EXCEÇÃO ---");
			exception.printStackTrace();
		}

		System.out.println("\nFinal da execução do método main.");
	}

	private static void firstMethod() {
		System.out.println("Início da execução do método firstMethod.");

		secondMethod();

		System.out.println("Final da execução do método firstMethod.");
	}

	private static void secondMethod() {
		System.out.println("Início da execução do método secondMethod.\n");

		throw new ExampleException();
		
		// System.out.println("Final da execução do método secondMethod.");
	}
}
