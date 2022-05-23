package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantas notas deseja lançar no sistema? ");
		int QtdNotas = teclado.nextInt();

		double notas[] = new double[QtdNotas];

		for (int i = 0; i < QtdNotas; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = teclado.nextDouble();
		}

		double soma = 0;

		for (double nota : notas) {
			soma += nota;
		}

		System.out.println(soma / QtdNotas);

		teclado.close();

	}
}
