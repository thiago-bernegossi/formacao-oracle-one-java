// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.IOException;
import java.io.PrintStream;

public class TestingOutputStreamWithPrintStream {

	public static void main(String[] args) throws IOException {
		// Processo de Fluxo de Saída de Dados com Arquivo.
		PrintStream printStream = new PrintStream("output.txt");
		
		printStream.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		
		printStream.close();
	}
}
