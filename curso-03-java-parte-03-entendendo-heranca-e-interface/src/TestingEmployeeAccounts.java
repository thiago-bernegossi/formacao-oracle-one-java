// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingEmployeeAccounts {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");

		CalculateSalaryBonus calculateSalaryBonus = new CalculateSalaryBonus();
		
		Manager firstManager = new Manager();
		
		firstManager.setEmployeeName("Donatello");
		System.out.println("O nome do gerente é " + firstManager.getEmployeeName() + ".");

		firstManager.setEmployeeItr("111.111.111-11");
		System.out.println("O CPF do gerente é " + firstManager.getEmployeeItr() + ".");

		firstManager.setEmployeeSalary(5250.50);
		System.out.println("O salário do gerente é R$ " + firstManager.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do gerente é R$ " + firstManager.employeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstManager);
		
		firstManager.authenticatePassword("*ABCD1234*");

		System.out.println();
		
		Director firstDirector = new Director();
		
		firstDirector.setEmployeeName("Leonardo");
		System.out.println("O nome do diretor é " + firstDirector.getEmployeeName() + ".");

		firstDirector.setEmployeeItr("222.222.222-22");
		System.out.println("O CPF do diretor é " + firstDirector.getEmployeeItr() + ".");

		firstDirector.setEmployeeSalary(5250.50);
		System.out.println("O salário do diretor é R$ " + firstDirector.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do diretor é R$ " + firstDirector.employeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstDirector);
		
		firstDirector.authenticatePassword("*EFGH5678*");
		
		System.out.println("\nObs.: O total de bônus salarial é R$ " + calculateSalaryBonus.getTotalSalaryBonus() + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
