package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		//put é usado para adicionar e atualizar.
		usuarios.put(1, "roberto");
		usuarios.put(2, "ricardo");
		usuarios.put(3, "rafaela");
		usuarios.put(4, "rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //pega as chaves.
		System.out.println(usuarios.values()); //pega os valores.
		System.out.println(usuarios.entrySet()); //pega chave e valor ao mesmo tempo.
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("rebeca"));
		
		System.out.println(usuarios.get(2)); // recebe a key
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "marcos"));
		
		
		for (int key: usuarios.keySet()) {
			System.out.println(key);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
	}
}
















