package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("victor");
		lista.add(u1);
		
		//or 
		
		lista.add(new Usuario("julia"));
		lista.add(new Usuario("Fer"));
		lista.add(new Usuario("ana"));
		
		System.out.println(lista.get(3).nome); //ana
		
		System.out.println(lista.remove(0)); //remove victor da lista
		System.out.println(lista.remove(new Usuario("ana")));
		
		System.out.println(lista.contains(u1));
		
		System.out.println(lista.get(1)); // Meu nome eh julia.
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
