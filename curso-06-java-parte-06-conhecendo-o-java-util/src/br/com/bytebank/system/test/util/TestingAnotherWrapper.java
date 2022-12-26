// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestingAnotherWrapper {

	public static void main(String[] args) {
		// Integer userInteger = new Integer(25);
		Number userAge = Integer.valueOf(25); // Processo de Autoboxing.
		System.out.println("A-) A idade do usuário é " + userAge.intValue() + " anos.\n"); // Processo de Unboxing.
		
		Number userSalary = Double.valueOf(3850.75);		
		System.out.println("B-) O salário do usuário é R$ " + userSalary.doubleValue() + ".\n");
		
		Boolean trueValue = Boolean.TRUE;
		System.out.println("C-) O resultado é " + trueValue.booleanValue() + ".");
		
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(25);
		numbers.add(3850.75);
		numbers.add(384000F);
		numbers.add(149600000L);
	}
}
