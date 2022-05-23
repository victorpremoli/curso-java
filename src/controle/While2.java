package controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Voce diz: ");
			valor = teclado.next();
		}
		
		System.out.println("Fim !");
		
		teclado.close();
	}
}
