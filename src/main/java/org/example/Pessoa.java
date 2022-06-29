package org.example;

public class Pessoa {
    private String nome;
    private String telefone;
    private String email;

    public Pessoa(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
       return String.format("Nome: %-10s - Telefone: %-10s - E-mail: %s ",
               this.nome,
               this.telefone,
               this.email);
    }
}
