// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.system.model.CheckingAccount;

public class TestingDeserialization {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
	  ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("account.txt"));
	  CheckingAccount firstCheckingAccount = (CheckingAccount) objectInputStream.readObject();
	  objectInputStream.close();
			  
	  System.out.println(firstCheckingAccount.toString());
	  
	  System.out.println("O nome do cliente é " + firstCheckingAccount.getAccountClient().getClientName() + ".");
	  System.out.println("O CPF do cliente " + firstCheckingAccount.getAccountClient().getClientName() + " é " + firstCheckingAccount.getAccountClient().getClientItr() + ".");
	}
}
