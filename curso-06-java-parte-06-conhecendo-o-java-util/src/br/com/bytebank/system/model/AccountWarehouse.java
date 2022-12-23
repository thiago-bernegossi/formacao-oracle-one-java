// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code AccountWarehouse}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class AccountWarehouse {

		private int freePosition;
		private Account[] reference;
		
		/**
		 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code AccountWarehouse}.
		 */
		public AccountWarehouse(int numberOfElements) {
			this.reference = new Account[numberOfElements];
			this.freePosition = 0;
		}
		
		/**
		 * Provê o método de classe que obtém o valor do atributo de classe {@code freePosition} do objeto atual.
		 * 
		 * @return this.freePosition;
		 * 				 Retorna o valor do atributo de classe {@code freePosition}.
		 */
		public int displayTheAmountOfElements() {
			return this.freePosition;
		}
		
		/**
		 * Provê o método de classe que obtém o valor do atributo de classe {@code reference} do objeto atual.
		 * 
		 * @param position
		 * 				O parâmetro que refere a posição de uma instância de um objeto do tipo {@code Account} em um array.
		 *
		 * @return this.references[position];
		 *				 Retorna o valor do atributo de classe {@code reference}.
		 */
		public Account displayTheAccount(int position) {
			return this.reference[position];
		}
		
		/**
		 * Provê o método de classe que define o valor do atributo de classe {@code reference} do objeto atual.
		 * 
		 * @param account
		 *				O parâmetro que define o valor do atributo de classe {@code reference}.
		 */
		public void addElement(Account account) {
			this.reference[this.freePosition] = account;
			this.freePosition++;
		}
}
