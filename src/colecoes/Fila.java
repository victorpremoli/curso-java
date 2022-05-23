package colecoes;

import java.util.LinkedList;
import java.util.Queue;

//primeiro a entra é o primeiro a sair
public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//add e offer tem a mesma função de adicionar um elemento na fila.
		//a difirença é quando a fila está cheia.
		fila.add("Ana"); //retorna false se a lista estiver cheia.
		fila.offer("Bia");//lança uma exceção se alista estiver cheia.
		fila.add("victor");
		fila.offer("carlos");
		fila.add("Gui");
		
		//Peek e Element -> obtem o proximo elemento da fila sem remover.
		//Tem diferença quando a fila está vazia.
		System.out.println(fila.peek()); //retorna null e a fila estiver vazia.
		System.out.println(fila.element());//lança uma exceção se a lista estiver vazia.
		
		//Poll retona o proximo elemento da fila e remove.
		//Se a fila estiver vazia retorna null
		System.out.println(fila.poll()); //ana
		System.out.println(fila.poll()); //bia
		
		//Remove retona o proximo elemento da fila e remove.
		//Se a fila estiver vazia lança uma exceção.
		System.out.println(fila.remove()); //victor

//		fila.clear(); limpa a fila
//		fila.size(); retona o tamnho da fila;
//		fila.isEmpty(); retora se a fila está vazia;
	}
}
