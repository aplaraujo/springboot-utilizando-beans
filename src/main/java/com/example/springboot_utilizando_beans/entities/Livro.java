package com.example.springboot_utilizando_beans.entities;

public class Livro {
    private String nome;
    private String codigo;

    public Livro(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("nome=").append(nome).append("\n");
        sb.append(", codigo=").append(codigo).append("\n");
        sb.append('}');
        return sb.toString();
    }
}
