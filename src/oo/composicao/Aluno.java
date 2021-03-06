package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
	
	void adicionaCurso (Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	
}
