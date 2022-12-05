// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingEmployeeAccounts {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");

		CalculateSalaryBonus calculateSalaryBonus = new CalculateSalaryBonus();
		
		Employee firstEmployee = new Employee();

		firstEmployee.setEmployeeName("Donatello");
		System.out.println("O nome do funcionário é " + firstEmployee.getEmployeeName() + ".");

		firstEmployee.setEmployeeItr("111.111.111-11");
		System.out.println("O CPF do funcionário é " + firstEmployee.getEmployeeItr() + ".");

		firstEmployee.setEmployeeSalary(3250.50);
		System.out.println("O salário do funcionário é R$ " + firstEmployee.getEmployeeSalary() + ".");

		System.out.println("O bônus salarial do funcionário é R$ " + firstEmployee.getEmployeeSalaryBonus() + ".");		
		calculateSalaryBonus.registerSalaryBonus(firstEmployee);
		
		System.out.println();
		
		Manager firstManager = new Manager();
		
		firstManager.setEmployeeName("Leonardo");
		System.out.println("O nome do gerente é " + firstManager.getEmployeeName() + ".");

		firstManager.setEmployeeItr("222.222.222-22");
		System.out.println("O CPF do gerente é " + firstManager.getEmployeeItr() + ".");

		firstManager.setEmployeeSalary(5250.50);
		System.out.println("O salário do gerente é R$ " + firstManager.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do gerente é R$ " + firstManager.getEmployeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstManager);
		
		firstManager.authenticatePassword("*ABCD1234*");

		System.out.println();
		
		Director firstDirector = new Director();
		
		firstDirector.setEmployeeName("Michelangelo");
		System.out.println("O nome do diretor é " + firstDirector.getEmployeeName() + ".");

		firstDirector.setEmployeeItr("333.333.333-33");
		System.out.println("O CPF do diretor é " + firstDirector.getEmployeeItr() + ".");

		firstDirector.setEmployeeSalary(5250.50);
		System.out.println("O salário do diretor é R$ " + firstDirector.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do diretor é R$ " + firstDirector.getEmployeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstDirector);
		
		firstDirector.authenticatePassword("*EFGH5678*");
		
		System.out.println("\nObs.: O total de bônus salarial é R$ " + calculateSalaryBonus.getTotalSalaryBonus() + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
