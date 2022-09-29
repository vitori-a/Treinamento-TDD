package br.com.gft.testes;
import br.com.gft.model.Mago;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;

public class MagoTest {
    private Mago mago;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        mago = new Mago();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws IOException {
        outContent.close();
    }

    @Test
    public void mago_deve_subir_de_level_aumentando_inteligencia_e_mana(){

        mago.setLevel(4);
        mago.setMana(21);
        mago.setInteligencia(35);
        mago.lvlUp();

        String expected = " + Level Up: 5\r\n + Mana: 22\r\n + Inteligência: 36\r\n";
        Assertions.assertEquals(expected, outContent.toString());

    }

    @Test
    public void mago_deve_aprender_magia(){

        mago.setMagia(Collections.singletonList("levitar"));

        Assertions.assertEquals(Collections.singletonList("levitar"), mago.aprenderMagia());
    }
}

