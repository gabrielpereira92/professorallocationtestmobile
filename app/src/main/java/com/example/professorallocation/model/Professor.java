package com.example.professorallocation.model;

public class Professor {

    private String nome;
    private String nomeCurso;
    private String cpf;
    private String urlImagem;


    public Professor() {
    }

    public Professor(String nome, String nomeCurso, String cpf, String urlImagem) {
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.cpf = cpf;
        this.urlImagem = urlImagem;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return   nome + " | " +nomeCurso;

    }

}
