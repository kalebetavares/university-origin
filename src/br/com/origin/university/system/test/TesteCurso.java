package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Curso;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Nutrição", "Lucas Careca", 88);
        Curso curso1 = new Curso("Ciência da Computação", "Claudio Ferreira", 66);

        System.out.println(curso);
        System.out.println(curso1);
    }
}
