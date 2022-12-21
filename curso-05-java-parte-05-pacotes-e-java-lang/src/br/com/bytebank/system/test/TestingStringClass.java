// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

public class TestingStringClass {

	public static void main(String[] args) {
		String firstVersion = "ByteBank";		
		String firstExpression = ("A-) ***** Olá! Seja muito bem-vindo(a) ao " + firstVersion + "! *****\n");
		System.out.println(firstExpression);

		String secondVersion = firstVersion.toLowerCase();
		String secondExpression = ("B-) ***** Olá! Seja muito bem-vindo(a) ao " + secondVersion + "! *****\n");
		System.out.println(secondExpression);

		String thirdVersion = secondVersion.replace('b', 'B');
		String thirdExpression = ("C-) ***** Olá! Seja muito bem-vindo(a) ao " + thirdVersion + "! *****\n");
		System.out.println(thirdExpression);
		
		String fourthVersion = thirdVersion.toUpperCase();
		String fourthExpression = ("D-) ***** Olá! Seja muito bem-vindo(a) ao " + fourthVersion + "! *****\n");
		System.out.println(fourthExpression);
		
		System.out.println("E-) O caractere na posição 0 no índice é " + fourthVersion.charAt(0) + ".\n");
		
		System.out.println("F-) O número de caracteres na expressão é " + thirdVersion.length() + ".\n");
		
		int indexPosition = fourthExpression.indexOf('B');
		System.out.println("G-) O caractere " + fourthVersion.charAt(0) + " está na posição " + indexPosition + " no índice.\n");
		
		String newSubString = fourthVersion.substring(0, 4);
		System.out.println("H-) A expressão da substring é " + newSubString + ".\n");
		
		String ExpressionWithCharacters = " ";
		System.out.println("I-) A expressão não contém caracteres? " + ExpressionWithCharacters.isEmpty() + ".\n");
		
		String ExpressionWithoutCharacters = "";
		System.out.println("J-) A expressão contém caracteres? " + ExpressionWithoutCharacters.isEmpty() + ".\n");
		
		String fifthExpression = "     ByteBank     ";
		System.out.println("K-) A nova expressão é " + fifthExpression.trim() + ".\n");
		
		System.out.println("L-) A expressão contém os caracteres Byte? " + fifthExpression.contains("Byte") + ".\n");

		for (int counter = 0; counter < firstVersion.length(); counter++) {
			System.out.println(firstVersion.charAt(counter));
		}
	}
}
