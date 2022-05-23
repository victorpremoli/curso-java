package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite as notas dos alunos: ");
		
		double valor = 0;
		double total = 0;
		int count = 0;
				
		do {
			valor = teclado.nextDouble();
			if (valor >=0 && valor <= 10) {
				total += valor;
				count++;
			} else {
				System.out.println("Nota invalida, digite um numero entre 0 e 10.");
			}
			
		} while (valor != -1);
		
		if (count > 0 ) {
			double media = total/count;
			System.out.printf("Media da turma: %.2f", media);
		}

		teclado.close();
	}
}
