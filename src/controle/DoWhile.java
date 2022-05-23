package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String texto = "";
		
		do {
			System.out.println("Qual a senha ?");
			texto = teclado.next();
		} while (!texto.equalsIgnoreCase("sair"));
		
		teclado.close();
	}
}
;