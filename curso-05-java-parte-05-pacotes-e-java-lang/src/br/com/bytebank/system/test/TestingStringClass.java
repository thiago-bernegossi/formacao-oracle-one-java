// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

public class TestingStringClass {

	public static void main(String[] args) {
		String firstVersion = "ByteBank";		
		String firstMessage = ("***** Olá! Seja muito bem-vindo(a) ao " + firstVersion + "! *****\n");
		System.out.println(firstMessage);
		
		String secondVersion = firstVersion.toLowerCase();
		String secondMessage = ("***** Olá! Seja muito bem-vindo(a) ao " + secondVersion + "! *****\n");
		System.out.println(secondMessage);
		
		String thirdVersion = secondVersion.replace("b", "B");
		String thirdMessage = ("***** Olá! Seja muito bem-vindo(a) ao " + thirdVersion + "! *****\n");
		System.out.println(thirdMessage);
	}
}
