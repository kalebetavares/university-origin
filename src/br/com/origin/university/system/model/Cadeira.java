package br.com.origin.university.system.model;

public class Cadeira {
    private String nome;
    private String professor;
    private Integer creditos;

    public Cadeira(String nome, String professor, Integer creditos) {
        this.nome = nome;
        this.professor = professor;
        this.creditos = creditos;
    }

    public String getNome() {
        return this.nome;
    }

    public String getProfessor() {
        return this.professor;
    }

    public Integer getCreditos() {
        return this.creditos;
    }

    @Override
    public String toString() {
        return "Cadeira: [" + nome +
                ", Professor: " + professor +
                ", Creditos:" + creditos +
                ']';
    }
}

