package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7;
		String parcial = media >= 5.0 ? "recuperacao" : "reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : parcial ;
		System.out.println(resultado);
	}
}
