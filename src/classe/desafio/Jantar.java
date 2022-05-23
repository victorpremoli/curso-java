package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Pizza", 1.2);
		Comida c2 = new Comida("Coca-Cola", 0.3);
		
		
		Pessoa p1 = new Pessoa("Victor", 90);
		
		p1.Comer(c1);
		p1.Comer(c2);
		
		System.out.println(p1.nome + " tem " + p1.peso + " Kg");
		
	}

}
