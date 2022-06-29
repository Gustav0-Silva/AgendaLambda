package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Persistence.getList().add(new Pessoa("Gustavo","99985-9878","gustavo@gmail.com"));
        Persistence.getList().add(new Pessoa("Gabriela","99985-9899","gabriela@gmail.com"));
        Persistence.getList().add(new Pessoa("Edilene","99985-9678","edilene@gmail.com"));
        Persistence.getList().add(new Pessoa("Larissa","99985-9666","larissa@hotmail.com"));
        Persistence.getList().add(new Pessoa("Sandro","95285-9878","sandro@hotmail.com"));
        Persistence.getList().add(new Pessoa("Mauricio","99443-8596","mauricio@terra.com"));

        Exibir.exibirRelatorio(p-> p.getNome().length()>1);

        System.out.println("-------------------------");
        System.out.println("Remova um usuário pelo nome: ");
        String nome = sc.nextLine();
        RemoverPessoa.remover(p-> p.getNome().equals(nome));
        Exibir.exibirRelatorio(p-> p.getNome().length()>1);

        System.out.println("-------------------------");
        System.out.println("Escolha um provedor para filtrar os emails: ");
        String email = sc.nextLine();
        Exibir.exibirRelatorio(p-> p.getEmail().contains(email));

        System.out.println("-------------------------");
        System.out.println("Digite um telefone para remover: ");
        String telefone = sc.nextLine();
        RemoverPessoa.remover(p-> p.getTelefone().equals(telefone));
        Exibir.exibirRelatorio(p-> p.getNome().length()>1);

        System.out.println("-------------------------");
        System.out.println("Pessoas que contenham uma determinada letra no nome: ");
        String letra = sc.nextLine();
        Exibir.exibirRelatorio(p-> p.getNome().toLowerCase().contains(letra.toLowerCase()));






    }
}
