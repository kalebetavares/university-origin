package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Aluno;
import br.com.origin.university.system.model.Curso;

public class TesteTotalDeAlunos {
    public static void main(String[] args) {
        Curso curso = new Curso("Educação Física");

        Aluno aluno1 = new Aluno("Flávio da Silva", "951.654.752-85");
        Aluno aluno2 = new Aluno("Claudia Pereira", "452-741-247-30");
        Aluno aluno3 = new Aluno("José da Silva", "357.158.624-03");

        curso.matricular(aluno1);
        curso.matricular(aluno2);
        curso.matricular(aluno3);

        System.out.println(curso.totalDeAlunos());
    }
}
