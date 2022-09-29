package br.com.gft.testes;
import br.com.gft.model.Livro;
import org.junit.jupiter.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LivroTest {

    private Livro livro;

    @Before
    public void setup(){
        livro = new Livro();
    }

    @Test
    public void nao_permitir_cobrar_imposto_do_livro_educativo(){
        livro.setTema("educativo");

        Assertions.assertEquals(0.0, livro.calcularimposto());
    }

    @Test
    public void deve_cobrar_imposto_de_livros_que_nao_sejam_educativos(){
        livro.setTema("ficção");
        livro.setPreco(45.50);

        Assertions.assertEquals(4.55, livro.calcularimposto());
    }
}
