// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Client {
	private String clientItr;
	private String clientLastName;
	private String clientName;

	public String getClientItr() {
		return this.clientItr;
	}
	
	public String getClientLastName() {
		return this.clientLastName;
	}
	
	public String getClientName() {
		return this.clientName;
	}

	public void setClientItr(String clientItr) {
		this.clientItr = clientItr;
	}

	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
}
