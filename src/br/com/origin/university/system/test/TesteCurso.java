package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Curso;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Nutrição");
        Curso curso1 = new Curso("Ciência da Computação");

        System.out.println(curso.getNome());
        System.out.println(curso1.getNome());


    }
}
