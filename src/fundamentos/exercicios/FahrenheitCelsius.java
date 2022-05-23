package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma temperatura em F: ");

		String temp = teclado.next().replace(",", ".");
		
		double tempFormat = Double.parseDouble(temp);
		double tempConvert = ((tempFormat - 32) * (5.0/9.0));

		System.out.printf("Temperatura equivalente em C : %.2f C", tempConvert);

		teclado.close();
	}
}
