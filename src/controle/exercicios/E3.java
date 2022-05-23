package controle.exercicios;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite a nota 1: ");
		double nota1 = teclado.nextDouble();

		System.out.print("Digite a nota 2: ");
		double nota2 = teclado.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0 && media > 4.0) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Reprovado");
		}

		teclado.close();

	}
}
