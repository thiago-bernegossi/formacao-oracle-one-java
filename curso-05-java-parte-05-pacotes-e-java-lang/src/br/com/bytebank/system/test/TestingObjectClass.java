// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.CheckingAccountWithCheckedException;
import br.com.bytebank.system.model.CheckingAccountWithUncheckedException;

public class TestingObjectClass {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		CheckingAccountWithCheckedException firstAccount = new CheckingAccountWithCheckedException("Primeira Conta", 654321, 123456789);	
		System.out.println(firstAccount.toString().concat(".\n"));
		
		Object secondAccount = new CheckingAccountWithCheckedException("Segunda Conta", 654321, 234567891);	
		System.out.println(secondAccount.toString().concat(".\n"));
		
		CheckingAccountWithUncheckedException thirdAccount = new CheckingAccountWithUncheckedException("Terceira Conta", 654321, 345678912);	
		System.out.println(thirdAccount.toString().concat(".\n"));
		
		Object fourthAccount = new CheckingAccountWithUncheckedException("Quarta Conta", 654321, 456789123);	
		System.out.println(fourthAccount.toString().concat("."));
		
		System.out.println("\nObs.: A quantidade de contas abertas no ByteBank é " + (CheckingAccountWithCheckedException.getAmountOfBankAccounts() + CheckingAccountWithUncheckedException.getAmountOfBankAccounts()) + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
