// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class StringTypeVariables {

	public static void main(String[] args) {	
		char character = 'A';
		System.out.println("A-) O caractere armazenado na variável é " + character + ";");
		
		char value = 66;
		System.out.println("B-) Agora, o caractere armazenado na variável é " + value + ";");
		
		character = (char) (character + 2);
		System.out.println("C-) Por fim, o caractere armazenado na variável é " + character + ";");
		
		String phrase = "Formação Oracle ONE: Java";
		System.out.println("D-) Este código-fonte trata-se de uma prática pedagógica intrínseca a " + phrase + ".");		
	}
}
