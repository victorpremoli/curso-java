package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1);
		conjunto.add(true);
		conjunto.add("victor");
		conjunto.add(10);
		conjunto.add("X");

		System.out.println("Tamanho " + conjunto.size());

		// Tamanho vai continuar o mesmo pois não aceita repetição;
		conjunto.add(10);
		System.out.println("Tamanho " + conjunto.size());

		// Retorna false pois elemento não existe;
		System.out.println(conjunto.remove(5));
		System.out.println("Tamanho " + conjunto.size());

		// retorna true;
		System.out.println(conjunto.remove(10));
		// Tamanho após remover o valor 10 do conjunto;
		System.out.println("Tamanho " + conjunto.size());

		// Retona false pois o valor foi removido na linha acima;
		System.out.println(conjunto.contains(10));
		System.out.println(conjunto.contains(true));
		System.out.println(conjunto.contains(1.2));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
				
		System.out.println(nums);
		System.out.println(conjunto);
		
//		//União entre dois conjuntos;
//		conjunto.addAll(nums);
		
//		//Interceção entre dois conjuntos
//		conjunto.retainAll(nums);
		
//		conjunto.clear(); //Apaga os valores do conjunto
//		nums.clear(); //Apaga os valores do conjunto
//		
//		System.out.println(nums);
//		System.out.println(conjunto);
	}
}
