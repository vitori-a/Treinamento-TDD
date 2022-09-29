package br.com.gft.testes;
import br.com.gft.model.Videogame;
import org.junit.jupiter.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class VideogameTest {

    private Videogame videogame;

    @Before
    public void setup(){
        videogame = new Videogame();
    }

    @Test
    public void deve_calcular_25_porcento_de_imposto_sobre_videogame_usado(){
        videogame.setUsado(true);
        videogame.setPreco(280);

        Assertions.assertEquals(70, videogame.calcularimposto());
    }

    @Test
    public void deve_calcular_45_porcento_de_imposto_sobre_videogame_usado(){
        videogame.setUsado(false);
        videogame.setPreco(790);

        Assertions.assertEquals(355.5, videogame.calcularimposto());
    }
}
