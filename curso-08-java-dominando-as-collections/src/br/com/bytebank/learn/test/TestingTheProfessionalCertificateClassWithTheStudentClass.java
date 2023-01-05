// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import br.com.bytebank.learn.model.Course;
import br.com.bytebank.learn.model.ProfessionalCertificate;
import br.com.bytebank.learn.model.Student;

public class TestingTheProfessionalCertificateClassWithTheStudentClass {

	public static void main(String[] args) {
		ProfessionalCertificate professionalCertificateInFinance = new ProfessionalCertificate("Finanças", "Paollo");
		
		professionalCertificateInFinance.add(new Course("Matemática Financeira", 35));
		professionalCertificateInFinance.add(new Course("Administração", 40));
		professionalCertificateInFinance.add(new Course("Economia", 45));
		professionalCertificateInFinance.add(new Course("Contabilidade", 50));
		
		Student firstStudent = new Student("Donatello", 123456);
		Student secondStudent = new Student("Leonardo", 234561);
		Student thirdStudent = new Student("Michelangelo", 345612);
		Student fourthStudent = new Student("Raphael", 456123);
		
		professionalCertificateInFinance.register(firstStudent);
		professionalCertificateInFinance.register(secondStudent);
		professionalCertificateInFinance.register(thirdStudent);
		professionalCertificateInFinance.register(fourthStudent);
		
		System.out.println("A-) Os alunos matriculados são:");
		
		professionalCertificateInFinance.getStudents().forEach(student -> {
			System.out.println(student);
		});
		
		System.out.println();
		
		System.out.println("B-) O aluno Donatello está matriculado: " + professionalCertificateInFinance.search(firstStudent) + ".\n"); 
	
		Student anotherStudent = new Student("Donatello", 123456);
		System.out.println("C-) O aluno Donatello está matriculado: " + professionalCertificateInFinance.search(anotherStudent) + ".\n"); 
	
		// Processo de Comparação de Dados com o Método equals().
		System.out.println("D-) O aluno Donatello está matriculado: " + firstStudent.equals(anotherStudent) + ".\n"); 

		// Processo de Comparação de Dados com o Método hashCode().
		System.out.println("E-) Há dois alunos matriculados que contém os mesmos dados: " + (firstStudent.hashCode() == anotherStudent.hashCode()) + ".");
	}
}
