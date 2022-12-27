// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.system.model.Account;
import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.Client;
import br.com.bytebank.system.model.SavingsAccount;

public class TestingLambda {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		List<Account> accounts = new ArrayList<Account>();
		
		SavingsAccount fourthAccount = new SavingsAccount("Quarta Conta", 654321, 456789123);
		Client fourthClient = new Client();
		fourthClient.setClientName("Raphael");
		fourthAccount.setAccountClient(fourthClient);
		accounts.add(fourthAccount);
		
		CheckingAccount firstAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		Client firstClient = new Client();
		firstClient.setClientName("Donatello");
		firstAccount.setAccountClient(firstClient);
		accounts.add(firstAccount);
		
		CheckingAccount thirdAccount = new CheckingAccount("Terceira Conta", 654321, 345678912);
		Client thirdClient = new Client();
		thirdClient.setClientName("Michelangelo");
		thirdAccount.setAccountClient(thirdClient);
		accounts.add(thirdAccount);
		
		SavingsAccount secondAccount = new SavingsAccount("Segunda Conta", 654321, 234567891);
		Client secondClient = new Client();
		secondClient.setClientName("Leonardo");
		secondAccount.setAccountClient(secondClient);
		accounts.add(secondAccount);
		
		System.out.println("Obs.: Extrato de contas sem a ordenação alfabética ou numérica.\n");
		
	  accounts.forEach((account) -> System.out.println(account.toString()));

		System.out.println("Obs.: Extrato de contas com a ordenação alfabética.\n");
		
		Comparator<Account> comparator = (Account firstReference, Account secondReference) -> { // Expressão Lambda.
			String firstClientName = firstReference.getAccountClient().getClientName();
			String secondClientName = secondReference.getAccountClient().getClientName();
			return firstClientName.compareTo(secondClientName);
		};
		
		accounts.sort(comparator);
		
	  accounts.forEach((account) -> System.out.println(account.toString()));
	  
		System.out.println("Obs.: A quantidade de contas armazenadas no array é " + accounts.size() + ".\n");
		
		System.out.println("Obs.: A quantidade de contas abertas no ByteBank é " + (Account.getAmountOfBankAccounts()) + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
