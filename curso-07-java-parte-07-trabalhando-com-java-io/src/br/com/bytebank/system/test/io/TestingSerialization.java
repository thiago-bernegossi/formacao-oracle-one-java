// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestingSerialization {

	public static void main(String[] args) throws Exception {
		String message = "Olá, Mundo!";
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("message.txt"));
		objectOutputStream.writeObject(message);
		objectOutputStream.close();
	
	  ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("message.txt"));
	  String newMessage = (String) objectInputStream.readObject();
	  objectInputStream.close();
	  
	  System.out.println("A mensagem é: " + newMessage);
	}
}
