// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

import java.util.LinkedList;
import java.util.List;
import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingLinkedList {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		List<Account> linkedList = new LinkedList<Account>();
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		linkedList.add(firstAccount);
		
		System.out.println(linkedList.get(0));
		
		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 234567891);
		linkedList.add(secondAccount);
		
		System.out.println(linkedList.get(1));
		
		linkedList.remove(0);
		linkedList.remove(0);

		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + linkedList.size() + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");		
		
		System.out.println();
		
		CheckingAccount thirdAccount = new CheckingAccount("Terceira Conta", 654321, 345678912);
		linkedList.add(thirdAccount);
		
		SavingsAccount fourthAccount = new SavingsAccount("Quarta Conta", 654321, 456789123);
		linkedList.add(fourthAccount);
		
		/*
		 * for (int counter = 0; counter < arrayList.size(); counter++) {
		 * System.out.println(arrayList.get(counter)); }
		 */
		
		for (Account account : linkedList) {
			System.out.println(account);
		}
		
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + linkedList.size() + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
