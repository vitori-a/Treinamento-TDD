package br.com.gft.main;
import java.util.ArrayList;
import java.util.List;
import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.Videogame;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

        Videogame ps4 = new Videogame("PS4", 1800,100,"Sony", "Slim", false);
        Videogame ps4Usado = new Videogame("PS4", 1000, 7, "Sony", "Slim", true);
        Videogame xbox = new Videogame("XBOX", 1500, 500, "Microsoft", "One", false);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        List<Videogame> videogames = new ArrayList<>();
        videogames.add(ps4);
        videogames.add(ps4Usado);
        videogames.add(xbox);

        Loja americanas = new Loja("Americanas", "12345", livros, videogames);

        l1.calcularimposto();
        l2.calcularimposto();
        l3.calcularimposto();

        ps4Usado.calcularimposto();
        ps4.calcularimposto();
        xbox.calcularimposto();

        americanas.listaLivros();
        americanas.listaVideoGame();
        americanas.calculaPatrimonio();
    }
}

