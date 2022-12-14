// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestingInputStreamWithScanner {

	public static void main(String[] args) throws Exception {
		// Processo de Fluxo de Entrada de Dados com Arquivo.
		Scanner scanner = new Scanner(new File("accounts.csv"), "UTF-8");
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			// System.out.println(line);
			
			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(Locale.US);
			lineScanner.useDelimiter(", ");
			
			String firstValue = lineScanner.next();
			int secondValue = lineScanner.nextInt();
			int thirdValue = lineScanner.nextInt();
			
			System.out.format(new Locale("pt", "BR"), "%s, %d, %d%n", firstValue, secondValue, thirdValue);
			
			lineScanner.close();
			
		  // String[] values = line.split(", ");
		  // System.out.println(Arrays.toString(values) + System.lineSeparator());
		}
		
		scanner.close();
	}
}
