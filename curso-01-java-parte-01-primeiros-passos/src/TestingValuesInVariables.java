// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingValuesInVariables {

	public static void main(String[] args) {
		int firstValue = 50;
		int secondValue = 100;
		System.out.println("A-) O valor da primeira variável é " + firstValue + ";");
		System.out.println("B-) O valor da segunda variável é " + secondValue + ";");
		
		secondValue = firstValue;
		System.out.println("C-) Agora, o valor da primeira variável é " + firstValue + ";");
		System.out.println("D-) O valor da segunda variável é " + secondValue + ";");
		
		firstValue = 75;
		System.out.println("E-) Por fim, o valor da primeira variável é " + firstValue + ";");
		System.out.print("F-) O valor da segunda variável é " + secondValue + ".");
	}
}
