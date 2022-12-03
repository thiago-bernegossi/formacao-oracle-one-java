// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingEmployeeAccounts {

	public static void main(String[] args) {
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");

		Employee firstEmployee = new Employee();

		firstEmployee.setEmployeeName("Donatello");
		System.out.println("O nome do funcionário é " + firstEmployee.getEmployeeName() + ".");

		firstEmployee.setEmployeeItr("111.111.111-11");
		System.out.println("O CPF do funcionário é " + firstEmployee.getEmployeeItr() + ".");

		firstEmployee.setEmployeeSalary(3250.50);
		System.out.println("O salário do funcionário é R$ " + firstEmployee.getEmployeeSalary() + ".");

		System.out.println("O bônus salarial do funcionário é R$ " + firstEmployee.salaryBonus() + ".");

		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
