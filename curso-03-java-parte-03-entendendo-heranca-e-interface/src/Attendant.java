// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Attendant extends Employee {

	@Override
	public double employeeSalaryBonus() {
		return super.getEmployeeSalary() * 0.125;
	}
}
