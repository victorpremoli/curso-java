package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
	Carro c1 = new Carro("Gol", 140, false);
	Carro c2 = new Carro("Ferrari", 250, false);
	Carro c3 = new Carro("BMW M3", 200, true);
	Carro c4 = new Carro("Corola", 160, true);
	Carro c5 = new Carro("Uno", 120, false);
	
	List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5);
	
	Predicate<Carro> carroRapido = c -> c.velocidade >= 150;
	Predicate<Carro> carroConfortavel = c -> c.confortavel == true;
	Function<Carro, String> mensagem = c -> "O carro " +  c.nome + " eh rapido e confortavel";
	
	carros.stream()
		.filter(carroRapido)
		.filter(carroConfortavel)
		.map(mensagem)
		.forEach(System.out::println);
		
	
	
		
		
	}
}
