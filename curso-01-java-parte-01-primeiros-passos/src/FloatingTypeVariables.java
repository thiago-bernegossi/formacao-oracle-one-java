// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class FloatingTypeVariables {

	public static void main(String[] args) {
		int userAge = 25;
		System.out.println("A-) A idade do usuário é " + userAge + " anos;");
		
		double userSalary = 3850.75;		
		System.out.println("B-) O salário do usuário é R$ " + userSalary + ";");
		
		int firstDivision = 7 / 5;
		System.out.println("C-) O resultado da divisão é " + firstDivision + ";");

		double lastDivision = 7.0 / 5.0;
		System.out.print("D-) Agora, o resultado da divisão é " + lastDivision + ".");		
	}
}
