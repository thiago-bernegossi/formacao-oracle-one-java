// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public abstract class Employee {
	private double employeeSalary;
	private String employeeItr;
	private String employeeLastName;
	private String employeeName;

	public abstract double employeeSalaryBonus();
	
	public double getEmployeeSalary() {
		return this.employeeSalary;
	}

	public String getEmployeeItr() {
		return this.employeeItr;
	}

	public String getEmployeeLastName() {
		return this.employeeLastName;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public void setEmployeeItr(String employeeItr) {
		this.employeeItr = employeeItr;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
