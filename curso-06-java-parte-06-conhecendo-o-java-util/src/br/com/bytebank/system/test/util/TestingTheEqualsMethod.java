// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

import java.util.ArrayList;

import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingTheEqualsMethod {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		ArrayList<Account> arrayList = new ArrayList<Account>();
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		arrayList.add(firstAccount);
		
		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 123456789);
		arrayList.add(secondAccount);
		
		for (Account account : arrayList) {
			System.out.println(account);
		}
		
		firstAccount.equals(secondAccount);
		
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + arrayList.size() + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
