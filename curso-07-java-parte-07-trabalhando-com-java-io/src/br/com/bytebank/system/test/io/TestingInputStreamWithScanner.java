// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.File;
import java.util.Scanner;

public class TestingInputStreamWithScanner {

	public static void main(String[] args) throws Exception {
		// Processo de Fluxo de Entrada de Dados com Arquivo.
		Scanner scanner = new Scanner(new File("accounts.csv"));
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		
		scanner.close();
	}
}
