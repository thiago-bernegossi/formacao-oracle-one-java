// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestingOutputStreamWithFile {

	public static void main(String[] args) throws IOException {
		// Processo de Fluxo de Saída de Dados com Arquivo.
		OutputStream fileOutputStream = new FileOutputStream("output.txt"); // Início do Padrão de Projeto Decorator.
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); // Final do Padrão de Projeto Decorator.
		
		bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		
		bufferedWriter.close();
	}
}
