package fundamentos.exercicios;

import java.util.Scanner;

public class CalculaImc {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o peso :");
		String peso = teclado.next().replace(",", ".");;

		System.out.println("Informe a altura :");
		String altura = teclado.next().replace(",", ".");
		
		double pesoFormat = Double.parseDouble(peso);
		double alturaFormat = Double.parseDouble(altura);
		
		double imc = pesoFormat / (alturaFormat * alturaFormat ); 
		
		System.out.printf("IMC: %.2f ", imc);
		
		teclado.close();
				
		
	}
}
