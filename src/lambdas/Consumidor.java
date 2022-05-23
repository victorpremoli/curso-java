package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);

		Produto p1 = new Produto("caneta", 3.4, 0.1);
		Produto p2 = new Produto("lapis", 3.2, 0.2);
		Produto p3 = new Produto("boracha", 2.4, 0.3);
		Produto p4 = new Produto("regua", 5.4, 0.3);
		Produto p5 = new Produto("caderno", 30.4, 0.2);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.preco));
		
		produtos.forEach(System.out::println);
	}
}
