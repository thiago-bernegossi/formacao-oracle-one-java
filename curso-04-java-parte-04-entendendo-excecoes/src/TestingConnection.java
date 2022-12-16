// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingConnection {

	public static void main(String[] args) {
		Connection firstConnection = null;
		
		try {
			firstConnection = new Connection();
			firstConnection.extractData();
		} catch (IllegalStateException exception) {
			System.out.println("--- OPERAÇÃO DE TRATAMENTO DE EXCEÇÃO ---");
			exception.printStackTrace();
		} finally {
			System.out.println();
			firstConnection.closeConnection();
		}
	}
}
