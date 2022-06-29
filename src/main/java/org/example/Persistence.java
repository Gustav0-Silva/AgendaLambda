package org.example;

import java.util.ArrayList;
import java.util.List;

public class Persistence {
    private static List<Pessoa> listaPessoas;

    public static List<Pessoa> getList (){
        if (listaPessoas == null){
            listaPessoas = new ArrayList<>();
        }
        return listaPessoas;
    }

    public static void remover(Pessoa pessoa){
        listaPessoas.remove(pessoa);
    }
}
