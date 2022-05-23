package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;
		
		System.out.println(media.apply(7.0, 5.8));
		
		BiFunction<Double, Double, String> resultado = 
				(n1, n2) -> media.apply(n1, n2) >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado.apply(7.0, 5.8));
	}
}
