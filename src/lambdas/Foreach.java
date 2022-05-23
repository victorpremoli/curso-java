package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("victor", "ana", "fer", "bia");
		
		System.out.println("ForEach tradicional");
		for(String a: aprovados) {
			System.out.println(a);
		}
		
		System.out.println("\nLambda #1");
		aprovados.forEach(a -> System.out.println(a + "!!"));
		
		System.out.println("\nLambda #2");
		aprovados.forEach(a -> meuImprimir(a));

		System.out.println("\nMethod Reference #1");
		aprovados.forEach(System.out::println);

		System.out.println("\nMethod Reference #2");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome e " + nome);
	}
}
