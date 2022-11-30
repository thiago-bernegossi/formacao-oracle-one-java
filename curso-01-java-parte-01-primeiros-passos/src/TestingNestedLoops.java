// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingNestedLoops {
	
	public static void main(String[] args) {
		
		for (int multiplicand = 0; multiplicand <= 10; multiplicand++) {
			for (int multiplier = 0; multiplier <= 10; multiplier++) {
				System.out.println(multiplicand + " × " + multiplier + " = " + multiplicand * multiplier);
				System.out.print("");
			}
			System.out.println();
		}
	}
}
