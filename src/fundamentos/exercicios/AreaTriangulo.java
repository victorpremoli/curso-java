package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a altura do triangulo: ");
		String sAltura = teclado.next().replace(",", ".");
		double altura = Double.parseDouble(sAltura);
		
		System.out.println("Digite o comprimento da base do triangulo: ");
		String sBase = teclado.next().replace(",", ".");
		double base = Double.parseDouble(sBase);
		
		double area = (base * altura) / 2;
		
		System.out.printf("A area do triangulo eh de %.2f metros quadrados.", area);
		
		teclado.close();
	}
}
