package controle.exercicios;

import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double num = teclado.nextDouble();
		
		if (num > 0 && num < 10 && num%2 == 0) {
			System.out.println("Numero valido");
		} else {
			System.out.println("Numero invalido");
		}
		
		teclado.close();
	}
}
