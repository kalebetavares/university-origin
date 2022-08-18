package br.com.origin.university.system.test;

import br.com.origin.university.system.model.Cadeira;
import br.com.origin.university.system.model.Curso;

public class TesteFiltraPorCreditos {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Ciência da Computação");

        Cadeira cadeira1 = new Cadeira("Introdução a Computação", "Paulo Machado", 66);
        Cadeira cadeira2 = new Cadeira("Algoritmo e Programação", "Carlos Porto", 88);
        Cadeira cadeira3 = new Cadeira("Algoritmo e Estrutura de Dados", "Alberto Barros", 88);


        curso1.adiciona(cadeira1);
        curso1.adiciona(cadeira2);
        curso1.adiciona(cadeira3);

        curso1.filtra(88);
    }
}
