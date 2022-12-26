// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.AccountNumberComparator;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingTheSortMethod {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		List<Account> accounts = new ArrayList<Account>();
		
		SavingsAccount fourthAccount = new SavingsAccount("Quarta Conta", 654321, 456789123);
		accounts.add(fourthAccount);
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		accounts.add(firstAccount);
		
		CheckingAccount thirdAccount = new CheckingAccount("Terceira Conta", 654321, 345678912);
		accounts.add(thirdAccount);
		
		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 234567891);
		accounts.add(secondAccount);
		
		System.out.println("Obs.: Extrato de contas sem a ordenação numérica.\n");
		
		for(Account account : accounts) {
			System.out.println(account.toString());
		}
		
		System.out.println("Obs.: Extrato de contas com a ordenação numérica.\n");

		AccountNumberComparator accountNumberComparator = new AccountNumberComparator();
		accounts.sort(accountNumberComparator);
		
		for(Account account : accounts) {
			System.out.println(account.toString());
		}
		
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + accounts.size() + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
