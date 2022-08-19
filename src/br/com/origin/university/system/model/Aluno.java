package br.com.origin.university.system.model;

import java.util.concurrent.ThreadLocalRandom;

public class Aluno {
    private String nome;
    private String cpf;
    private Integer matricula = ThreadLocalRandom.current().nextInt(1000, 10000);


    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        return "Aluno: [" + this.nome +
                ", cpf: " + this.cpf +
                ", matricula: " + this.matricula +
                ']';
    }
}
