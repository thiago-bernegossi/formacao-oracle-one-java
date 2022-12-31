// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.test.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TestingEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String character = "Ç";
		System.out.println("A-) O code point é " + character.codePointAt(0) + ".\n");
		
		Charset charset = Charset.defaultCharset();
		System.out.println("B-) O charset padrão é " + charset.displayName() + ".\n");
		
		byte[] bytes = character.getBytes("UTF-16");
		System.out.println("C-) Agora, o charset utilizado foi o UTF-16 e a quantidade de bytes é " + bytes.length + ".\n");
		
		String newCharacter = new String(bytes, "UTF-16");
		System.out.println("D-) O caractere é " + newCharacter + ".\n");
	}
}
