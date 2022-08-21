package br.com.origin.university.system.model;

import java.util.*;

public class Curso {
    private String nome;
    private Set<Cadeira> gradeCurricular = new HashSet<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer,Aluno> alunosMatriculados = new HashMap<>();

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


    public void filtra(Integer credito) {
        this.gradeCurricular.stream()
                .filter(cadeira -> cadeira.getCreditos().equals(credito))
                .map(Cadeira::getNome)
                .forEach(System.out::println);
    }
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.alunosMatriculados.put(aluno.getMatricula(), aluno);
    }

    public Aluno buscarAlunoMatriculado(Integer numero) {
        if(!this.alunosMatriculados.containsKey(numero)) throw new NoSuchElementException();
        return alunosMatriculados.get(numero);
    }

    @Override
    public String toString() {
        return "Curso: " + this.nome +
                ", Grade Curricular:" + this.gradeCurricular;
    }

    public boolean verificaCadeira(Cadeira cadeira) {
        return this.gradeCurricular.contains(cadeira);
    }
}
