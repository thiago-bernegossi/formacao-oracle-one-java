// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class BooleanTypeVariables {

	public static void main(String[] args) {
		int liters = 100;
		boolean value = liters > 0 && liters <= 1000;

		if (value == true) {
			System.out.print("A-) O valor informado é compatível com a capacidade de armazenamento do reservatório.");
		} else {
			System.out.print("B-) O valor informado não é compatível com a capacidade de armazenamento do reservatório.");
		}
	}
}
