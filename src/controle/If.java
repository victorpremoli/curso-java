package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a media: ");
		double media = teclado.nextDouble();
		
		if (media >= 7.0 && media <= 10) {
			System.out.println("Aprovado");
			System.out.println("Parabens");
		}
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperacao");
		}
		
		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		teclado.close();
	}
}
