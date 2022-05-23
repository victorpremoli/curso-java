package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> user = new HashSet<Usuario>();
		
		user.add(new Usuario("victor"));
		user.add(new Usuario("fer"));
		user.add(new Usuario("ana"));
		
		boolean resultado = user.contains(new Usuario("ana"));
		System.out.println(resultado);
	}
}
