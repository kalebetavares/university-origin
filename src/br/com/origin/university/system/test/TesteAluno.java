package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("José da Silva", "951.654.752-85");

        System.out.println(aluno.getMatricula());
    }
}
