// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.CheckingAccount;

public class TestingArrayWithReference {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		CheckingAccount[] checkingAccounts = new CheckingAccount[2];
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		
		checkingAccounts[0] = firstAccount;
		System.out.println(checkingAccounts[0].toString());
		
		CheckingAccount secondAccount = new CheckingAccount("Segunda Conta", 654321, 234567891);
		
		checkingAccounts[1] = secondAccount;
		System.out.println(checkingAccounts[1].toString());
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (CheckingAccount.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
