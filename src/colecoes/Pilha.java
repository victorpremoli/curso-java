package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

//o ultimo que entrou é o primeiro a sair
public class Pilha {
	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		
		//adiciona a pilha
		pilha.add("victor");
		pilha.push("ana"); 
		pilha.push("fernanda");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		
		//poll remove da pilha, retorna null caso não encontre.
		System.out.println(pilha.poll());
		
		
		System.out.println(pilha.pop());
		System.out.println(pilha.remove());
		
//		pilha.size();
//		pilha.clear();
//		pilha.contains("victor");		
//		pilha.isEmpty();
	}
}
