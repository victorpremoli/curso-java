package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUltilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS", "C", "JAVA", "PHP");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem = (String) ListaUltil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimaNumero = (Integer) ListaUltil.getUltimo1(nums);
		System.out.println(ultimaNumero);
		
		
		//Não precisa fazer o cast.
		String ultimaLinguagem2 = ListaUltil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		//Outra forma de ser feito e não precisa fazer o cast.
		Integer ultimaNumero2 = ListaUltil.<Integer>getUltimo2(nums);
		System.out.println(ultimaNumero2);
	}
}
