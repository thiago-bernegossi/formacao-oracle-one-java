// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import br.com.bytebank.learn.model.Course;
import br.com.bytebank.learn.model.ProfessionalCertificate;
import br.com.bytebank.learn.model.Student;

public class TestingTheInterfaceMap {

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
		
		professionalCertificateInFinance.isRegistered(firstStudent);
		professionalCertificateInFinance.isRegistered(secondStudent);
		professionalCertificateInFinance.isRegistered(thirdStudent);
		professionalCertificateInFinance.isRegistered(fourthStudent);
		
		Student student = professionalCertificateInFinance.searchRegistered(456123);
		System.out.println("Dados da Matrícula: " + student);
	}
}
