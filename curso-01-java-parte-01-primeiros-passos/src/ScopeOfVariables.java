// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class ScopeOfVariables {

	public static void main(String[] args) {
		boolean storageCapacity;
		double liters = 1500;

		if (liters > 0 && liters <= 1000) {
			storageCapacity = true;
		} else {
			storageCapacity = false;
		}
		
		if (storageCapacity == true) {
			System.out.print("A-) O valor informado é compatível com a capacidade de armazenamento do reservatório.");
		} else {
			System.out.print("B-) O valor informado não é compatível com a capacidade de armazenamento do reservatório.");
		}
	}
}
