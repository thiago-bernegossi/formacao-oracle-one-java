// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingInputStreamWithFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("lorem.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String firstLine = bufferedReader.readLine();
		System.out.println("O conteúdo da primeira linha do texto é: \n" + firstLine);
		
		bufferedReader.close();
	}
}
