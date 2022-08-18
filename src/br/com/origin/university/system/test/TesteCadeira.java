package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Cadeira;

public class TesteCadeira {
    public static void main(String[] args) {
        Cadeira cadeira1 = new Cadeira("Introdução a Computação", "Paulo Machado", 66);
        Cadeira cadeira2 = new Cadeira("Algoritmo e Programação", "Carlos Porto", 88);

        System.out.println(cadeira1);
        System.out.println(cadeira2);
    }
}
