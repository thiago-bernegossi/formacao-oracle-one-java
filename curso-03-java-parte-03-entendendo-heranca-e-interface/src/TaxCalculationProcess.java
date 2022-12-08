// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TaxCalculationProcess {

	private double totalTax;
	
	public double getTotalTax() {
		return this.totalTax;
	}

	public void calculateTax(Taxable taxable) {
		double newValue = taxable.taxAmount();
		this.totalTax += newValue;
	}
}
