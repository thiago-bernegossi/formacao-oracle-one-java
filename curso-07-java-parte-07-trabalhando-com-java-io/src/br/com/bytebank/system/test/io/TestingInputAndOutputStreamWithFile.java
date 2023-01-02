// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestingInputAndOutputStreamWithFile {

	public static void main(String[] args) throws IOException {
		// Processo de Fluxo de Entrada de Dados com Arquivo.
		InputStream fileInputStream = new FileInputStream("input.txt"); // Início do Padrão de Projeto Decorator.
		Reader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // Final do Padrão de Projeto Decorator.

		// Processo de Fluxo de Saída de Dados com Arquivo.
		OutputStream fileOutputStream = new FileOutputStream("output.txt"); // Início do Padrão de Projeto Decorator.
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); // Final do Padrão de Projeto Decorator.
		
		String line = bufferedReader.readLine();
		
		while (line != null && !line.isEmpty()) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			line = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
