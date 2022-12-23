// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.AccountWarehouse;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingAccountWarehouse {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		AccountWarehouse accountWarehouse = new AccountWarehouse(10);
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		accountWarehouse.addElement(firstAccount);
		
		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 234567891);
		accountWarehouse.addElement(secondAccount);
		
		Account firstAccountStoredInArray = accountWarehouse.displayTheAccount(0);
		System.out.println(firstAccountStoredInArray.toString());
		
		Account secondAccountStoredInArray = accountWarehouse.displayTheAccount(1);
		System.out.println(secondAccountStoredInArray.toString());
		
		int references = accountWarehouse.displayTheAmountOfElements();
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + references + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
