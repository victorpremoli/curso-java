package classe;

public class ProdutoTest {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4580.99);

		var p2 = new Produto("Caneta", 5);
		
//		alterando o disconto direntamente na classe. valor padrão 0.25
		Produto.disconto = 0.50;

		double finalPrice1 = p1.priceWithDiscount();
		double finalPrice2 = p2.priceWithDiscount();
		double totalPrice = finalPrice1 + finalPrice2;

		System.out.printf("Nome: %s", p1.nome);
		System.out.println();
		System.out.printf("Preco: %.2f", finalPrice1);

		System.out.println();
		System.out.println();

		System.out.printf("Nome: %s", p2.nome);
		System.out.println();
		System.out.printf("Preco: %.2f", finalPrice2);

		System.out.println();
		System.out.println("-----------");
		System.out.printf("Total: %.2f ", totalPrice);

	}
}
