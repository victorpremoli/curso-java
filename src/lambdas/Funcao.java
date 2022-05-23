package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				n -> n % 2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = 
				s -> "O resultado e: " + s;
			
		Function<String, String> empolgado = 
				v -> v + "!!!";
				
		System.out.println(parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(50));
	}
}
