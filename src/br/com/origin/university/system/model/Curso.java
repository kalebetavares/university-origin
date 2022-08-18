package br.com.origin.university.system.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nome;
    private Set<Cadeira> gradeCurricular = new HashSet<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Set<Cadeira> getGradeCurricular() {
        return Collections.unmodifiableSet(this.gradeCurricular);
    }

    public void adiciona(Cadeira cadeira) {
        this.gradeCurricular.add(cadeira);
    }



    @Override
    public String toString() {
        return "Curso: " + this.nome +
                ", Grade Curricular:" + this.gradeCurricular;
    }

    public void filtra(Integer credito) {
        this.gradeCurricular.stream()
                .filter(cadeira -> cadeira.getCreditos().equals(credito))
                .map(Cadeira::getNome)
                .forEach(System.out::println);
    }
}
