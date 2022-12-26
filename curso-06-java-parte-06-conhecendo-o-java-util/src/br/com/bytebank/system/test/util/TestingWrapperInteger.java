// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

public class TestingWrapperInteger {

	public static void main(String[] args) {
		System.out.println("A-) O valor mínimo cabível em um Integer é " + Integer.MIN_VALUE + ".\n");
		
		System.out.println("B-) O valor máximo cabível em um Integer é " + Integer.MAX_VALUE + ".\n");
		
		System.out.println("C-) O número de bits utilizado para representar um Integer é " + Integer.SIZE + ".\n");
		
		System.out.println("D-) O número de bytes utilizado para representar um Integer é " + Integer.BYTES + ".\n");
		
		int userAge = 25;
		System.out.println("E-) A idade do usuário é " + userAge + " anos.\n");
		
		Integer value = Integer.valueOf(userAge); // Processo de Autoboxing.
		System.out.println("F-) A idade do usuário é " + value.doubleValue() + " anos.\n");
		
		int newValue = value.intValue(); // Processo de Unboxing.
	}
}
