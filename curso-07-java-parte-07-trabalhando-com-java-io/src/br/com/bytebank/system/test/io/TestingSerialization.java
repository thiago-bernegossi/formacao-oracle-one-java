// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.system.model.CheckingAccount;
import br.com.bytebank.system.model.Client;

public class TestingSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		CheckingAccount firstCheckingAccount = new CheckingAccount("Primeira Conta", 654321, 123456789);
		Client firstClient = new Client();
		firstCheckingAccount.setAccountClient(firstClient);
		firstClient.setClientName("Donatello");
		firstClient.setClientItr("111.111.111-11");
				
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("account.txt"));
		objectOutputStream.writeObject(firstCheckingAccount);
		objectOutputStream.close();
	}
}
