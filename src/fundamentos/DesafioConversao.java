package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		String salario1 = teclado.nextLine().replace(",", ".");
				
		System.out.println("Digite o segundo valor");
		String salario2 = teclado.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceito valor");
		String salario3 = teclado.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1); 
		double s2 = Double.parseDouble(salario2); 
		double s3 = Double.parseDouble(salario3); 
		
		double total = s1 + s2 + s3;
		double media = total/3;
		
		System.out.printf("A media do salario eh = %f", media);
		
		teclado.close();
		
	}
}
