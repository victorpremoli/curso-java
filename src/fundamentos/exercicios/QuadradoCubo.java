package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		String num = teclado.next().replace(",",".");
		
		double numFormat = Double.parseDouble(num);
		
		double numAoQuadrado = Math.pow(numFormat, 2);
		double numAoCubo = Math.pow(numFormat, 3);
				
		System.out.printf("%.2f ao quadrado = %.2f ",numFormat, numAoQuadrado );
		System.out.printf("\n%.2f ao cubo = %.2f",numFormat, numAoCubo);
		
		teclado.close();
		
	}
}
