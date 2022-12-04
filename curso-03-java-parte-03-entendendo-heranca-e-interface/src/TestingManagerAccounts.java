// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingManagerAccounts {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");

		Manager firstManager = new Manager();
		
		firstManager.setEmployeeName("Leonardo");
		System.out.println("O nome do gerente é " + firstManager.getEmployeeName() + ".");

		firstManager.setEmployeeItr("222.222.222-22");
		System.out.println("O CPF do gerente é " + firstManager.getEmployeeItr() + ".");

		firstManager.setEmployeeSalary(5250.50);
		System.out.println("O salário do gerente é R$ " + firstManager.getEmployeeSalary() + ".");
		
		System.out.println("O bônus salarial do gerente é R$ " + firstManager.getEmployeeSalaryBonus() + ".");
		
		firstManager.authenticatePassword("*ABCD1234*");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
