// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.CheckedException;
import br.com.bytebank.system.model.CheckingAccountWithCheckedException;

public class TestingClientAccountWithCheckedException {

	public static void main(String[] args) throws CheckedException {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		CheckingAccountWithCheckedException firstAccount = new CheckingAccountWithCheckedException("Primeira Conta", 654321, 123456789);		
		
		System.out.println("O apelido da conta é " + firstAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + firstAccount.getAccountNickname() + " é " + firstAccount.getAccountNumber() + ".");	
		System.out.println("O saldo atual da " + firstAccount.getAccountNickname() + " é R$ " + firstAccount.getAccountBalance() + ".");
		
		System.out.println();
		
		CheckingAccountWithCheckedException secondAccount = new CheckingAccountWithCheckedException("Segunda Conta", 654321, 234567891);	
		
		System.out.println("O apelido da conta é " + secondAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + secondAccount.getAccountNickname() + " é " + secondAccount.getAccountNumber() + ".");	
		System.out.println("O saldo atual da " + secondAccount.getAccountNickname() + " é R$ " + secondAccount.getAccountBalance() + ".");

		firstAccount.depositValue(100);
		firstAccount.transferValue(50, secondAccount);
		
		System.out.println();
		
		System.out.println("O saldo atual da " + firstAccount.getAccountNickname() + " é R$ " + firstAccount.getAccountBalance() + ".");
		System.out.println("O saldo atual da " + secondAccount.getAccountNickname() + " é R$ " + secondAccount.getAccountBalance() + ".");
		
		System.out.println("\nObs.: A quantidade de contas abertas no ByteBank é " + CheckingAccountWithCheckedException.getAmountOfBankAccounts() + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
