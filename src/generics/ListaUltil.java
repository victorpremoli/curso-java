package generics;

import java.util.List;

public class ListaUltil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}

	// A e B -> São os tipos dos parametros que estão sendo recebidos no método.
	// C -> É o tipo do retorno do método.
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
