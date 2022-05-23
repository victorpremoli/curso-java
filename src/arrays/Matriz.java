package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantos alunos tem na sala? ");
		int numAlunos = teclado.nextInt();

		System.out.print("Quantas notas por aluno? ");
		int numNotas = teclado.nextInt();

		double sala[][] = new double[numAlunos][numNotas];

		double total = 0;
		
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				System.out.printf("Digite a nota %d do aluno %d: ", j+1, i+1);
				sala[i][j] = teclado.nextDouble();
				total += sala[i][j];
			}
		}
		
		double media = total / (numAlunos * numNotas);
		System.out.println(media);
		
		teclado.close();
	}
}
