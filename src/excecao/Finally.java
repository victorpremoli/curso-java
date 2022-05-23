package excecao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		try {			
			System.out.println(7 / teclado.nextInt() );						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finaly...");
			teclado.close();			
		}
		
		System.out.println("Fim.");
	}
}
