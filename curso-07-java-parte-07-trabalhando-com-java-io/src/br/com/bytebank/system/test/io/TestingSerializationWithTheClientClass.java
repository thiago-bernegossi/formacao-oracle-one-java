// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.system.model.Client;

public class TestingSerializationWithTheClientClass {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		Client client = new Client();
		client.setClientName("Donatello");
		client.setClientItr("111.111.111-11");
				
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("client.txt"));
		objectOutputStream.writeObject(client);
		objectOutputStream.close();
		
	  ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("client.txt"));
	  Client firstClient = (Client) objectInputStream.readObject();
	  objectInputStream.close();
			  
	  System.out.println("O nome do cliente é " + firstClient.getClientName() + ".");
	  System.out.println("O CPF do cliente " + firstClient.getClientName() + " é " + firstClient.getClientItr() + ".");
	}
}
