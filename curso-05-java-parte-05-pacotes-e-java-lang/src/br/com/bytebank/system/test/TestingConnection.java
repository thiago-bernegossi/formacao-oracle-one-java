// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test;

import br.com.bytebank.system.model.*;

public class TestingConnection {

	public static void main(String[] args) throws Exception {
		try (Connection firstConnection = new Connection()) {
			firstConnection.extractData();
		} catch (IllegalStateException exception) {
			System.out.println("--- OPERAÇÃO DE TRATAMENTO DE EXCEÇÃO ---");
			exception.printStackTrace();
		}
	}
}
