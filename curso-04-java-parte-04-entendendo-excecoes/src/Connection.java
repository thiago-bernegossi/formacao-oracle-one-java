// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Connection {
	
	public Connection() {
		System.out.println("--- OPERAÇÃO DE CONEXÃO ---");
		System.out.println("A operação de conexão com o banco de dados fora realizada.\n");
	}
	
	public void extractData() {
		System.out.println("--- OPERAÇÃO DE CONEXÃO ---");
		System.out.println("A operação de extração de dados fora realizada.\n");
		throw new IllegalStateException();
	}
	
	public void closeConnection() {
		System.out.println("--- OPERAÇÃO DE CONEXÃO ---");
		System.out.println("A operação de desconexão com o banco de dados fora realizada.\n");
	}
}
