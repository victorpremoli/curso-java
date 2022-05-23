package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(99.2);
		
		Comida c1 = new Arroz(0.300);
		Comida c2 = new Feijao(0.200);
		Comida c3 = new Sorvete(0.250);

		System.out.println(p1.getPeso());
		
		p1.Comer(c1);
		p1.Comer(c2);
		p1.Comer(c3);
		
		System.out.println(p1.getPeso());
	}
}
