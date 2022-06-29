package org.example;

import org.example.InterfacesFuncionais.ListarPessoas;

public class Exibir {
    public static void exibirRelatorio(ListarPessoas listarPessoas) {
        for (Pessoa pessoa:Persistence.getList()) {
            if (listarPessoas.filtrar(pessoa)){
                System.out.println(pessoa);
            }
        }

    }
}
