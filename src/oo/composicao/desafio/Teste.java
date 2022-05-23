package oo.composicao.desafio;

public class Teste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Canteta", 1, 100);
		compra1.adicionarItem("Notebook", 2000, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Mesa", 250, 2);
		compra2.adicionarItem("Cadeira", 100, 2);
		
		Cliente cliente = new Cliente("victor premoli");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
