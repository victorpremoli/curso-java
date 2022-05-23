package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 6.1);
		Aluno a3 = new Aluno("Juh", 8.1);
		Aluno a4 = new Aluno("Fer", 10);
		Aluno a5 = new Aluno("Fer", 10);
		Aluno a6 = new Aluno("Fer", 10);
		Aluno a7 = new Aluno("Fer", 10);
		Aluno a8 = new Aluno("Fer", 10);
		Aluno a9 = new Aluno("Fer", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);

		System.out.println("distinct....");
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(2).limit(1).forEach(System.out::println);

		System.out.println("\ntakeWhile");
		alunos.stream().distinct().takeWhile(a -> a.nota > 7).forEach(System.out::println);

	}
}
