package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String name;
	final List<Aluno> alunos = new ArrayList<>();

	
	 Curso(String name) {
		this.name = name;
	}

	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}
