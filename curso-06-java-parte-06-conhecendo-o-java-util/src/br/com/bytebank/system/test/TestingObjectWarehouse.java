// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.ObjectWarehouse;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingObjectWarehouse {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		ObjectWarehouse objectWarehouse = new ObjectWarehouse(10);
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		objectWarehouse.addElement(firstAccount);

		System.out.println(objectWarehouse.displayTheAccount(0));

		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 234567891);
		objectWarehouse.addElement(secondAccount);
		
		System.out.println(objectWarehouse.displayTheAccount(1));
		
		int references = (int) objectWarehouse.displayTheAmountOfElements();
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + references + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
