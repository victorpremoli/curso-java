package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();

	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(quantidade, produto));
	}
	
	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}