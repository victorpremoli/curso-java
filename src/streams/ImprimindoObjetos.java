package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Fer", "Bia");
		
		//Usando o for tradicional
		System.out.println("\nUsando o for");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		//Usando o foreach
		System.out.println("\nUsando o foreach");
		for (String n: aprovados) {
			System.out.println(n);
		}
		
		//Usando o Iterator do java
		System.out.println("\nUsando Iterator");
		Iterator<String> iterator = aprovados.iterator();		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
		
	}
} 
