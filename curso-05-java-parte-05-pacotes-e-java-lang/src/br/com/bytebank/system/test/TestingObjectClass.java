// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.CheckingAccountWithUncheckedException;
import br.com.bytebank.system.model.SavingsAccountWithCheckedException;

public class TestingObjectClass {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		CheckingAccountWithUncheckedException firstAccount = new CheckingAccountWithUncheckedException("Primeira Conta", 654321, 123456789);	
		System.out.println(firstAccount);
		
		Object secondAccount = new SavingsAccountWithCheckedException("Segunda Conta", 654321, 234567891);	
		System.out.println(secondAccount);
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (CheckingAccountWithUncheckedException.getAmountOfBankAccounts() + SavingsAccountWithCheckedException.getAmountOfBankAccounts()) + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
