package br.com.gft.main;

import br.com.gft.model.Metodos;
import br.com.gft.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Desafios 4, 5 e 6");
        System.out.println("-----------------------------------------------------------");

        Pessoa p1 = new Pessoa("João", 15);
        Pessoa p2 = new Pessoa("Leandro", 21);
        Pessoa p3 = new Pessoa("Paulo", 17);
        Pessoa p4 = new Pessoa("Jéssica", 18);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        Metodos m = new Metodos(pessoas);
        m.listarPessoas();
        m.maisVelho();
        m.excluir();
        m.buscar();
    }

}
