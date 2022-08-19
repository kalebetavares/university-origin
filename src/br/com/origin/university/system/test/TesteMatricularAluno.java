package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Aluno;
import br.com.origin.university.system.model.Curso;

public class TesteMatricularAluno {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Ciência da Computação");

        Aluno aluno1 = new Aluno("José da Silva", "951.654.752-85");
        Aluno aluno2 = new Aluno("Claudia Pereira", "452-741-247-30");
        Aluno aluno3 = new Aluno("José da Silva", "357.158.624-03");

        curso1.matricular(aluno1);
        curso1.matricular(aluno2);
        curso1.matricular(aluno3);

        Integer numero = aluno1.getMatricula();
        System.out.println(curso1.getAlunos());
        System.out.println(curso1.buscarAlunoMatriculado(numero));

    }
}
