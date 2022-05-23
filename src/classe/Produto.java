package classe;

public class Produto {

	String nome;
	double preco;
	static double disconto = 0.25;

	// constructor padrão do java feito de forma explicita
	Produto() {

	}

	// constructor que recebe variáveis.
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	double priceWithDiscount() {
		return preco * (1 - disconto);
	}

}
