// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

import java.util.ArrayList;

import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingArrayList {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		ArrayList arrayList = new ArrayList();
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		arrayList.add(firstAccount);
		
		System.out.println(arrayList.get(0));
		
		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 234567891);
		arrayList.add(secondAccount);
		
		System.out.println(arrayList.get(1));
		
		arrayList.remove(0);
		arrayList.remove(0);
		
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + arrayList.size() + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");		
		
		System.out.println();
		
		CheckingAccount thirdAccount = new CheckingAccount("Terceira Conta", 654321, 345678912);
		arrayList.add(thirdAccount);
		
		SavingsAccount fourthAccount = new SavingsAccount("Quarta Conta", 654321, 456789123);
		arrayList.add(fourthAccount);
		
		/*
		 * for (int counter = 0; counter < arrayList.size(); counter++) {
		 * System.out.println(arrayList.get(counter)); }
		 */
		
		for (Object account : arrayList) {
			System.out.println(account);
		}
		
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + arrayList.size() + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
