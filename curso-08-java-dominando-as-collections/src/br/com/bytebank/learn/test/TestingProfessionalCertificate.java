// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

package br.com.bytebank.learn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bytebank.learn.model.Course;
import br.com.bytebank.learn.model.ProfessionalCertificate;

public class TestingProfessionalCertificate {

	public static void main(String[] args) {
		ProfessionalCertificate professionalCertificateInFinance = new ProfessionalCertificate("Finanças", "Donatello");
		
		professionalCertificateInFinance.add(new Course("Matemática Financeira", 35));
		professionalCertificateInFinance.add(new Course("Administração", 40));
		professionalCertificateInFinance.add(new Course("Economia", 45));
		professionalCertificateInFinance.add(new Course("Contabilidade", 50));
		
		System.out.println(professionalCertificateInFinance);
		
		List<Course> immutableState = professionalCertificateInFinance.getCourses();
		System.out.println(immutableState);
		
		List<Course> mutableState = new ArrayList<>(immutableState);
		Collections.sort(mutableState);
		System.out.println(mutableState);
	}
}
