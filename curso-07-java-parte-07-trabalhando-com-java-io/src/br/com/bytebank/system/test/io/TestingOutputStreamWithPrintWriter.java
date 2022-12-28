// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.IOException;
import java.io.PrintWriter;

public class TestingOutputStreamWithPrintWriter {

	public static void main(String[] args) throws IOException {
		// Processo de Fluxo de Saída de Dados com Arquivo.
		PrintWriter printWriter = new PrintWriter("output.txt");
		
		printWriter.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		
		printWriter.close();
	}
}
