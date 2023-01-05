// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.Iterator;
import java.util.Set;

import br.com.bytebank.learn.model.Course;
import br.com.bytebank.learn.model.ProfessionalCertificate;
import br.com.bytebank.learn.model.Student;

public class TestingTheIteratorMethod {

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
		
		Set<Student> students = professionalCertificateInFinance.getStudents();
		Iterator<Student> iterator = students.iterator();
		
		System.out.println("A-) Os alunos matriculados são:");
		
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
	}
}
