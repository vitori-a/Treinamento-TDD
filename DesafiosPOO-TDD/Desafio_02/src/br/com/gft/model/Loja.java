package br.com.gft.model;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<Videogame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<Videogame> videoGames) {
        super();
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Videogame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<Videogame> videoGames) {
        this.videoGames = videoGames;
    }

    public List<Livro> listaLivros() {

        System.out.println("-------------------------------------------------------------------------");
        livros.forEach(livro -> System.out.println("Título: " + livro.getNome() + ", preço: " + livro.getPreco() + ", quantidade: " + livro.getQtd() + " em estoque"));
        return livros;
    }

    public List<Videogame> listaVideoGame() {

        System.out.println("-------------------------------------------------------------------------");
        videoGames.forEach(videogame -> System.out.println("Video-game: " + videogame.getModelo() + ", preço: " + videogame.getPreco() + ", quantidade: " + videogame.getQtd() + " em estoque"));

        return videoGames;
    }

    public double calculaPatrimonio() {

        double totalLivros = 0;
        double totalGames = 0;
        
        for (Livro livro : livros) {
                totalLivros = livro.getPreco() * livro.getQtd();
        }
        for(Videogame videogame : videoGames) {
             totalGames = videogame.getPreco() * videogame.getQtd();
        }

        double patrimonio = totalGames + totalLivros;
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("O patrimonio da loja Americanas é de " + patrimonio);
        return patrimonio;
    }
}
