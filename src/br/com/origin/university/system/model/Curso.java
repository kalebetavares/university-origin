package br.com.origin.university.system.model;

import java.util.Collections;

public class Curso {
    private String nome;
    private String professor;
    private Integer horasAulas;


    public Curso(String nome, String professor, Integer horasAulas) {
        this.nome = nome;
        this.professor = professor;
        this.horasAulas = horasAulas;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public Integer getHorasAulas() {
        return horasAulas;
    }

    @Override
    public String toString() {
        return "Curso{" + this.nome +
                ", Professor: '" + this.professor +
                ", Horas: " + this.horasAulas +
                '}';
    }
}
