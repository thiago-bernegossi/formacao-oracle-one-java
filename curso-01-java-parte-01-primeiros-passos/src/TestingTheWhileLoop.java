// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingTheWhileLoop {

	public static void main(String[] args) {
		int counter = 0;
		int total = 0;

		while (counter <= 25) {
			total += counter;
			System.out.println("O valor é " + total + ".");

			counter++;
		}
	}
}
