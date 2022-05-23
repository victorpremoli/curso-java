package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		//Convertendo valor1 e valor2 que são strings para um número.
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		//Soma e média com o valores convertidos.
		double soma  = numero1 + numero2; 
		double media = soma / 2;
		
		System.out.println("Soma eh " + soma);
		System.out.println("Media eh " + media);
	}
}
