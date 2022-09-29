package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro(){

    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }


    @Override
    public double calcularimposto() {
      
        double imposto = 0;
        if (getTema() != "educativo") {
            imposto = 0.10 * getPreco();
            System.out.println("R$ " + imposto + " de impostos sobre o livro " + getNome());
        } else {
            System.out.println("Livro educativo não tem imposto: " + getNome());
        }
        return imposto;
    }

}