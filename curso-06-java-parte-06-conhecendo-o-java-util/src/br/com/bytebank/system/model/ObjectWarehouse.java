// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.system.model;

/**
 * Provê a classe necessária para a instanciação de um objeto do tipo {@code ObjectWarehouse}.
 * 
 * @author Thiago Bernegossi
 * @since	 1.0
 */
public class ObjectWarehouse {

		private int freePosition;
		private Object[] reference;
		
		/**
		 * Provê o construtor que é invocado quando há a instanciação de um objeto do tipo {@code ObjectWarehouse}.
		 */
		public ObjectWarehouse(int numberOfElements) {
			this.reference = new Object[numberOfElements];
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
		 * 				O parâmetro que refere a posição de uma instância de um objeto do tipo {@code Object} em um array.
		 *
		 * @return this.references[position];
		 *				 Retorna o valor do atributo de classe {@code reference}.
		 */
		public Object displayTheAccount(int position) {
			return this.reference[position];
		}
		
		/**
		 * Provê o método de classe que define o valor do atributo de classe {@code reference} do objeto atual.
		 * 
		 * @param reference
		 *				O parâmetro que define o valor do atributo de classe {@code reference}.
		 */
		public void addElement(Object reference) {
			this.reference[this.freePosition] = reference;
			this.freePosition++;
		}
}
