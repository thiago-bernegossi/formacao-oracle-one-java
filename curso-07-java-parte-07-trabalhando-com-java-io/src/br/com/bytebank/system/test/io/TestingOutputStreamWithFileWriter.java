// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestingOutputStreamWithFileWriter {

	public static void main(String[] args) throws IOException {
		// Processo de Fluxo de Saída de Dados com Arquivo.
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
		bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bufferedWriter.newLine();
		
		bufferedWriter.close();
	}
}
