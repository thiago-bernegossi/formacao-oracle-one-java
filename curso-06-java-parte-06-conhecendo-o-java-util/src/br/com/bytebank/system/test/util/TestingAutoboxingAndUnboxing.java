// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestingAutoboxingAndUnboxing {

	public static void main(String[] args) {
		int userAge = 25;
		
		Integer newUserAge = new Integer(userAge);
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(newUserAge);
		System.out.println("A-) A idade do usuário é " + list.get(0) + " anos;");
	}
}
