// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestingInputStreamWithFile {

	public static void main(String[] args) throws IOException {
		// Processo de Fluxo de Entrada de Dados com Arquivo.
		InputStream fileInputStream = new FileInputStream("input.txt"); // Início do Padrão de Projeto Decorator.
		Reader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // Final do Padrão de Projeto Decorator.
		
		String firstLine = bufferedReader.readLine();
		System.out.println(firstLine);
		
		bufferedReader.close();
	}
}
