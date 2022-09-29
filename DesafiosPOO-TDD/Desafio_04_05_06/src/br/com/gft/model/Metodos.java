package br.com.gft.model;

import java.util.List;

public class Metodos {
    private List<Pessoa> pessoas;

    public Metodos(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }


    public List<Pessoa> listarPessoas(){
        System.out.println("Nome \t\tIdade");
        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome() + "\t\t " + pessoa.getIdade());
        }
        return pessoas;
    }

    // Desafio 4
    public String maisVelho() {
        System.out.println("-----------------------------------------------------------");

        int max = pessoas.get(0).getIdade();
        int n = pessoas.size();
        String nome = pessoas.get(0).getNome();

        for (int i = 1; i < n; i++) {
            if (pessoas.get(i).getIdade() > max) {
                max = pessoas.get(i).getIdade();
                nome = pessoas.get(i).getNome();
            }
        }
        System.out.println("A pessoa mais velha é " + nome + " e possui " + max + " anos de idade");
        return nome;
    }

    // Desafio 5
    public boolean excluir() {
        pessoas.removeIf(pessoa -> (pessoa.getIdade() < 18));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nome \t\tIdade");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + "\t\t " + p.getIdade());
        }
        return true;
    }

    // Desafio 6
    public String buscar() {
        System.out.println("-----------------------------------------------------------");
        for (Pessoa p : pessoas) {
            if (p.getNome() == "Jéssica"){
                System.out.println("Nome encontrado: " + p.getNome() + ", idade: " + p.getIdade());
            }
        }
        return "Jéssica";
    }


}
