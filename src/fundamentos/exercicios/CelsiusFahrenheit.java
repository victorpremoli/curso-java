package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em C: ");
		
		String temp = teclado.next().replace(",", ".");
		double tempFormat = Double.parseDouble(temp);
				
		double tempConvert = ((tempFormat * (9.0/5.0)) + 32);
		
		System.out.printf("Temperatura equivalente em F : %.2f F", tempConvert);
		
		teclado.close();
	}
}
