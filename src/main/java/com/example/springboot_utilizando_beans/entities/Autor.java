package com.example.springboot_utilizando_beans.entities;

public class Autor {
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor{");
        sb.append("nome=").append(nome).append("\n");
        sb.append('}');
        return sb.toString();
    }


}
