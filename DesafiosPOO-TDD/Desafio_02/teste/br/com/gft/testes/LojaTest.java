package br.com.gft.testes;
import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.Videogame;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;

public class LojaTest {

    @Test
    public void deve_calcular_o_patrimonio_da_loja(){

        List<Livro> livros = new ArrayList<>();
        Livro teste = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
        livros.add(teste);

        List<Videogame> videogames = new ArrayList<>();
        Videogame testeG = new Videogame("PS4", 1800,100,"Sony", "Slim", false);
        videogames.add(testeG);

        Loja americanas = new Loja("Americanas", "12345", livros, videogames);

        Assertions.assertEquals(182000,americanas.calculaPatrimonio());
    }
}
