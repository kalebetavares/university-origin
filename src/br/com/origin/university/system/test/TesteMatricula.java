package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Aluno;
import br.com.origin.university.system.model.Curso;

public class TesteMatricula {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("José da Silva", "951.654.752-85");

        curso1.matricula(aluno);

        Integer numero = aluno.getMatricula();
        System.out.println(curso1.buscarAlunoMatriculado(numero));
    }
}
