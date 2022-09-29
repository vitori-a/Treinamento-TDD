package br.com.gft.testes;
import br.com.gft.model.Guerreiro;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;

public class GuerreiroTest {
    private Guerreiro guerreiro;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        guerreiro = new Guerreiro();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws IOException {
        outContent.close();
    }

    @Test
    public void guerreiro_deve_subir_de_level_aumentando_forca_e_vida(){

        guerreiro.setLevel(7);
        guerreiro.setForca(60);
        guerreiro.setVida(5);
        guerreiro.lvlUp();

        String expected = " + Level Up: 8\r\n + Vida: 6\r\n + Força: 61\r\n";
        Assertions.assertEquals(expected, outContent.toString());
    }

    @Test
    public void setGuerreiro_deve_aprender_habilidade(){

        guerreiro.setHabilidade(Collections.singletonList("esquivar-se"));

        Assertions.assertEquals(Collections.singletonList("esquivar-se"), guerreiro.aprenderHabilidade());
    }
}
