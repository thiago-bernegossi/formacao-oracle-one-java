// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class CalculateSalaryBonus {

	private double totalSalaryBonus;
	
	public double getTotalSalaryBonus() {
		return this.totalSalaryBonus;
	}
	
	public void registerSalaryBonus(Employee employee) {
		double employeeSalaryBonus = employee.getEmployeeSalaryBonus();
		this.totalSalaryBonus += employeeSalaryBonus;
	}	
}
