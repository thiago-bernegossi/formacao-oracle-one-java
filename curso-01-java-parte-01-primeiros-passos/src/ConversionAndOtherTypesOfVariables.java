// Este código-fonte segue a definição completa dos padrões de codificação do Google para a linguagem de programação Java™.

public class ConversionAndOtherTypesOfVariables {
	
	public static void main(String[] args) {
		byte earthSatellites = 1;
		System.out.println("A-) O planeta Terra tem apenas " + earthSatellites + " um satélite natural, a Lua;");
		
		short missionNumber = 11;
		int moonLandingYear = 1969;
		System.out.println("B-) O primeiro pouso na Lua ocorreu no ano de " + moonLandingYear + ", através da missão Apollo " + missionNumber + ";");
		
		long distanceBetweenSunAndEarth = 149600000L;
		System.out.println("C-) A distância aproximada entre o Sol e a Terra é de " + distanceBetweenSunAndEarth + " quilômetros;");
		
		double jupiterSatellites = 79.00;
		int numberOfSatellites = (int) jupiterSatellites;
		System.out.println("D-) O planeta Júpiter tem " + numberOfSatellites + " satélites naturais;");
		
		float distanceBetweenMoonAndEarth = 384000F;
		System.out.print("E-) A distância aproximada entre a Lua e a Terra é de " + distanceBetweenMoonAndEarth + " quilômetros.");
	}
}
