package org.example;

import org.example.InterfacesFuncionais.FiltrosDeRemover;

public class RemoverPessoa {
    public static void remover(FiltrosDeRemover filtroRemover){
        for (Pessoa pessoa:Persistence.getList()) {
            if (filtroRemover.remover(pessoa)){
                Persistence.remover(pessoa);
                return;
            }
        }
    }
}
