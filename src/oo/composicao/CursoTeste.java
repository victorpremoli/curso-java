package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("victor");
		Aluno a2 = new Aluno("fer");
		Aluno a3 = new Aluno("ana");
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Logica");
		Curso c3 = new Curso("Flutter");
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		
		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);
		
		a1.adicionaCurso(c3);
		a2.adicionaCurso(c3);
		a3.adicionaCurso(c3);
		
		for (Aluno aluno: c3.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println(a1.cursos.get(0).alunos);
	}
}
