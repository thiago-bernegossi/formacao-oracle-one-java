// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestingDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("A-) A data de hoje é " + today + ".\n");
		
		LocalDate dateOfFirstSystemRefactoring = LocalDate.of(2025, Month.JANUARY, 1);
		System.out.println("B-) A data estipulada para o término da primeira refatoração do sistema ByteBank Learn é " + dateOfFirstSystemRefactoring + ".\n");
		
		int yearsLeft = dateOfFirstSystemRefactoring.getYear() - today.getYear();
		System.out.println("C-) Falta(m) " + yearsLeft + " ano(s) para o término da primeira refatoração do sistema ByteBank Learn. \n");

		// Period period = Period.between(today, systemRefactoringDate);
		
		LocalDate dateOfSecondSystemRefactoring = LocalDate.of(2023, Month.JANUARY, 1);
		dateOfSecondSystemRefactoring = dateOfSecondSystemRefactoring.plusYears(3);
		System.out.println("D-) A data estipulada para o término da segunda refatoração do sistema ByteBank Learn é " + dateOfSecondSystemRefactoring + ".\n");
		
		DateTimeFormatter firstDateTimeFormatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		String dateTimeFormatter = dateOfSecondSystemRefactoring.format(firstDateTimeFormatter);
		System.out.println("E-) A data estipulada para o término da segunda refatoração do sistema ByteBank Learn é " + dateTimeFormatter + ".\n");
		
		DateTimeFormatter secondDateTimeFormatter = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:MM");
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println("F-) A data de hoje é " + localdatetime.format(secondDateTimeFormatter) + ".\n");
		
		LocalTime interval = LocalTime.of(15, 30);
		System.out.println("G-) O intervalo será às " + interval + ".");
	}
}
