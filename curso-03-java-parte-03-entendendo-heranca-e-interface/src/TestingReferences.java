// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingReferences {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");

		Employee secondManager = new Manager();
		
		secondManager.setEmployeeName("Michelangelo");
		System.out.println("O nome do gerente é " + secondManager.getEmployeeName() + ".");

		secondManager.setEmployeeItr("333.333.333-33");
		System.out.println("O CPF do gerente é " + secondManager.getEmployeeItr() + ".");

		secondManager.setEmployeeSalary(5250.50);
		System.out.println("O salário do gerente é R$ " + secondManager.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do gerente é R$ " + secondManager.getEmployeeSalaryBonus() + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
