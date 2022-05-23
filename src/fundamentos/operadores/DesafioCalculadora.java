package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		double num1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo numero:");
		double num2 = teclado.nextDouble();
		
		System.out.println("Digite a operacao desejada (+, -, *, /, %):");
		String op = teclado.next();
		
		double result = "+".equals(op) ? num1 + num2 : 0;
		result = "-".equals(op) ? num1 - num2 : result;
		result = "*".equals(op) ? num1 * num2 : result;
		result = "/".equals(op) ? num1 / num2 : result;
		result = "%".equals(op) ? num1 % num2 : result;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);
		
		teclado.close();	
	}
}
