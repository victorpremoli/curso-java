package generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("teste");
		System.out.println(caixaA.abrir());

		Caixa<Integer> caixaB = new Caixa<>();
		caixaB.guardar(4);
		System.out.println(caixaB.abrir());

	}
}
