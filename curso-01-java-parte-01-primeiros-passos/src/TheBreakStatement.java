// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TheBreakStatement {

	public static void main(String[] args) {
		
		for (int line = 0; line <= 10; line++) {
			for (int column = 0; column <= 10; column++) {
				if (column > line) {
					break;
				}				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
