// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestingAnotherInputAndOutputStreamWithFile {

	public static void main(String[] args) throws IOException {
		// Processo de Fluxo de Entrada de Dados com Teclado.
		InputStream inputStream = System.in;// Início do Padrão de Projeto Decorator.
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // Final do Padrão de Projeto Decorator.
		
		// Processo de Fluxo de Saída de Dados com Display.
		OutputStream outputStream = System.out; // Início do Padrão de Projeto Decorator.
		Writer outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); // Final do Padrão de Projeto Decorator.
		
		String line = bufferedReader.readLine();
		
		while (line != null && !line.isEmpty()) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			line = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
