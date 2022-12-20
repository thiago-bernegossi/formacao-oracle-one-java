// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code Connection}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class Connection implements AutoCloseable {

	public Connection() {
		System.out.println("--- OPERAÇÃO DE CONEXÃO ---");
		System.out.println("A operação de conexão com o banco de dados fora realizada.\n");
		// throw new IllegalStateException();
	}

	@Override
	public void close() throws Exception {
		System.out.println("--- OPERAÇÃO DE CONEXÃO ---");
		System.out.println("A operação de desconexão com o banco de dados fora realizada.\n");
	}
	
	public void extractData() {
		System.out.println("--- OPERAÇÃO DE CONEXÃO ---");
		System.out.println("A operação de extração de dados fora realizada.\n");
		throw new IllegalStateException();
	}
}
