package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto {
	public static void main(String[] args) {

//		Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();

		lista.add("ana");
		lista.add("fernanda");
		lista.add("victor");

		for (String candidato : lista) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(2);
		nums.add(5);
		nums.add(1);
		
		for (int n : nums) {
			System.out.println(n);
		}
	}
}
