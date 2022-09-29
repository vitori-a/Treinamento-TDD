package br.com.gft.testes;
import br.com.gft.model.Guerreiro;
import br.com.gft.model.Mago;
import br.com.gft.model.Personagem;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PersonagemTest {

    @Test
    public void deve_contar_e_mostrar_a_quantidade_de_personagens_criados(){

        Personagem player1 = new Mago();
        Personagem player2 = new Guerreiro();
        Personagem player3 = new Guerreiro();
        Personagem player4 = new Mago();
        Personagem player5 = new Mago();

        Assertions.assertEquals(5, Personagem.quantidadePersonagens());
    }
}
