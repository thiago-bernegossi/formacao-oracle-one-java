// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class Employee {
	private double employeeSalary;
	private String employeeItr;
	private String employeeLastName;
	private String employeeName;

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public String getEmployeeItr() {
		return employeeItr;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public String getEmployeeName() {
		return employeeName;
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

	public double salaryBonus() {
		return this.employeeSalary * 0.10;
	}
}
