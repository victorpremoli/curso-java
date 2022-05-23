package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 8.5);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Dani", 9.8);
		Aluno a4 = new Aluno("Victor", 6.8);
		Aluno a5 = new Aluno("Fer", 8.1);
		Aluno a6 = new Aluno("Juh", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, String> mensagem = a -> "Parabens " + a.nome + "! Voce foi aprovado(a).";

		alunos.stream()
			.filter(aprovados)
			.map(mensagem)
			.forEach(System.out::println);
	}
}
