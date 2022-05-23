package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Victor Premoli";
		compra1.adicionarItem("caneta", 20, 2.45);
		compra1.adicionarItem("lapis", 10, 2.10);
		compra1.adicionarItem("borracha", 5, 1.40);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		
	}
}
