// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TheIfStatement {

	public static void main(String[] args) {
		double hour = 12.30;
						
		if (hour >= 00.00 && hour <= 11.59) {
			System.out.print("A-) Olá, bom dia!");
		} else if (hour >= 12.00 && hour <= 17.59) {
			System.out.print("B-) Olá, boa tarde!");
		} else if (hour >= 18.00 && hour <= 24.00) {
			System.out.print("C-) Olá, boa noite!");					
		} else {
			System.out.print("D-) O horário informado é inválido!");			
		}
	}
}
