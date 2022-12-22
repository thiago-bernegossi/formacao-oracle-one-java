// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

public class TestingArray {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		int[] ages = new int[4];
		
		ages[0] = 25;
		System.out.println("A-) A idade do cliente Donatello é " + ages[0] + " anos;\n");	
		
		ages[1] = 25;
		System.out.println("B-) A idade do cliente Leonardo é " + ages[1] + " anos;\n");		
		
		ages[2] = 25;
		System.out.println("C-) A idade do cliente Michelangelo é " + ages[2] + " anos;\n");		
		
		ages[3] = 25;
		System.out.print("D-) A idade do cliente Raphael é " + ages[3] + " anos.\n");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
