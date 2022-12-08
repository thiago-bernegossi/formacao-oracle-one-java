// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class TestingTaxableAccount {

	public static void main(String[] args) {		
		System.out.println("***** Olá! Seja muito bem-vindo(a) ao ByteBank! *****\n");
		
		CheckingAccount firstCheckingAccount = new CheckingAccount("Primeira Conta Corrente", 654321, 123456789);
		
		System.out.println("O apelido da conta corrente é " + firstCheckingAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + firstCheckingAccount.getAccountNickname() + " é " + firstCheckingAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + firstCheckingAccount.getAccountNickname() + " é " + firstCheckingAccount.getAccountNumber() + ".");	
		
		firstCheckingAccount.depositValue(500);	
		System.out.println("O saldo atual da " + firstCheckingAccount.getAccountNickname() + " é R$ " + firstCheckingAccount.getAccountBalance() + ".");
		
		System.out.println();
		
		SavingsAccount firstSavingsAccount = new SavingsAccount("Primeira Conta Poupança", 654321, 234567891);

		System.out.println("O apelido da conta poupança é " + firstSavingsAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + firstSavingsAccount.getAccountNickname() + " é " + firstSavingsAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + firstSavingsAccount.getAccountNickname() + " é " + firstSavingsAccount.getAccountNumber() + ".");	
	
		firstSavingsAccount.depositValue(1000);
		System.out.println("O saldo atual da " + firstSavingsAccount.getAccountNickname() + " é R$ " + firstSavingsAccount.getAccountBalance() + ".");

		System.out.println();
		
		BusinessAccount firstBusinessAccount = new BusinessAccount("Primeira Conta Empresarial", 654321, 345678912);	

		System.out.println("O apelido da conta empresarial é " + firstBusinessAccount.getAccountNickname() + ".");
		System.out.println("A agência da " + firstBusinessAccount.getAccountNickname() + " é " + firstBusinessAccount.getAccountAgency() + ".");	
		System.out.println("O número da " + firstBusinessAccount.getAccountNickname() + " é " + firstBusinessAccount.getAccountNumber() + ".");	
	
		firstBusinessAccount.depositValue(1500);
		System.out.println("O saldo atual da " + firstBusinessAccount.getAccountNickname() + " é R$ " + firstBusinessAccount.getAccountBalance() + ".");

		TaxCalculationProcess taxCalculationProcess = new TaxCalculationProcess();
		
		taxCalculationProcess.calculateTax(firstCheckingAccount);
		taxCalculationProcess.calculateTax(firstSavingsAccount);
		taxCalculationProcess.calculateTax(firstBusinessAccount);

		System.out.println("\nObs.: O total de tributáveis das " + Account.getAmountOfBankAccounts() + " contas é R$ " + taxCalculationProcess.getTotalTax() + ".");
		
		System.out.println("\n***** Obrigado(a) por utilizar nossos serviços. *****");
	}
}
