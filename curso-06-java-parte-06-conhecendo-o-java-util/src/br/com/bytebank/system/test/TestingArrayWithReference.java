// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingArrayWithReference {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		Object[] references = new Object[2];
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		
		references[0] = firstAccount;
		System.out.println(references[0].toString());
		
		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 234567891);
		
		references[1] = secondAccount;
		System.out.println(references[1].toString());
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) +  ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
