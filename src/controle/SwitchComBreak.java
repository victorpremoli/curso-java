package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String conceito = "";
		
		System.out.print("Informe a nota: ");
		int nota = teclado.nextInt();
		
		switch (nota) {
		case 10: case 9: 
			conceito = "A";
			break;
		case 8: case 7: 
			conceito = "B";
			break;
		case 6: case 5: 
			conceito = "C";
			break;
		case 4: case 3: 
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		case 0: 
			conceito = "F";
			break;
		default :
			conceito = "Nao informado";
		}
		
		System.out.printf("Conceito %s", conceito);
		teclado.close();
	}
}
