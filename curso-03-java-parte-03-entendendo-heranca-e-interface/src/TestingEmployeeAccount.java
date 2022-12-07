// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingEmployeeAccount {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");

		CalculateSalaryBonus calculateSalaryBonus = new CalculateSalaryBonus();
		
		Attendant firstAttendant = new Attendant();
		
		firstAttendant.setEmployeeName("Donatello");
		System.out.println("O nome do atendente é " + firstAttendant.getEmployeeName() + ".");

		firstAttendant.setEmployeeItr("111.111.111-11");
		System.out.println("O CPF do atendente é " + firstAttendant.getEmployeeItr() + ".");

		firstAttendant.setEmployeeSalary(2625.25);
		System.out.println("O salário do atendente é R$ " + firstAttendant.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do atendente é R$ " + firstAttendant.employeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstAttendant);
		
		System.out.println();
		
		ExternalAuditor firstExternalAuditor = new ExternalAuditor();
		
		firstExternalAuditor.setEmployeeName("Leonardo");
		System.out.println("O nome do auditor externo é " + firstExternalAuditor.getEmployeeName() + ".");

		firstExternalAuditor.setEmployeeItr("222.222.222-22");
		System.out.println("O CPF do auditor externo é " + firstExternalAuditor.getEmployeeItr() + ".");

		firstExternalAuditor.setEmployeeSalary(5250.50);
		System.out.println("O salário do auditor externo é R$ " + firstExternalAuditor.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do auditor externo é R$ " + firstExternalAuditor.employeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstExternalAuditor);
		
		firstExternalAuditor.authenticatePassword("*IJKL8901*");
		
		System.out.println();
		
		Manager firstManager = new Manager();
		
		firstManager.setEmployeeName("Michelangelo");
		System.out.println("O nome do gerente é " + firstManager.getEmployeeName() + ".");

		firstManager.setEmployeeItr("333.333.333-33");
		System.out.println("O CPF do gerente é " + firstManager.getEmployeeItr() + ".");

		firstManager.setEmployeeSalary(5250.50);
		System.out.println("O salário do gerente é R$ " + firstManager.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do gerente é R$ " + firstManager.employeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstManager);
		
		firstManager.authenticatePassword("*EFGH4567*");

		System.out.println();
		
		Director firstDirector = new Director();
		
		firstDirector.setEmployeeName("Raphael");
		System.out.println("O nome do diretor é " + firstDirector.getEmployeeName() + ".");

		firstDirector.setEmployeeItr("444.444.444-44");
		System.out.println("O CPF do diretor é " + firstDirector.getEmployeeItr() + ".");

		firstDirector.setEmployeeSalary(7875.75);
		System.out.println("O salário do diretor é R$ " + firstDirector.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do diretor é R$ " + firstDirector.employeeSalaryBonus() + ".");
		calculateSalaryBonus.registerSalaryBonus(firstDirector);
		
		firstDirector.authenticatePassword("*ABCD0123*");
		
		System.out.println("\nObs.: O total de bônus salarial é R$ " + calculateSalaryBonus.getTotalSalaryBonus() + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
