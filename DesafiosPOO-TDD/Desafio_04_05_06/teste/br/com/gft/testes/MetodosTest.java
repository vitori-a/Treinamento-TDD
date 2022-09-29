package br.com.gft.testes;
import br.com.gft.model.Metodos;
import br.com.gft.model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MetodosTest {

    // exercicio 4
    @Test
    public void deve_mostrar_a_pessoa_mais_velha_da_lista(){

        List<Pessoa> pessoas = new ArrayList<>();
        Metodos teste = new Metodos(pessoas);

        Pessoa pessoa1 = new Pessoa("Igor", 25);
        Pessoa pessoa2 = new Pessoa("Ambrósio", 21);
        Pessoa pessoa3 = new Pessoa("Caue", 14);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        Assertions.assertEquals(pessoa1.getNome(), teste.maisVelho());
    }

    // Exercicio 5
    @Test
    public void permitir_buscar_pessoa_pelo_nome_jessica(){

        List<Pessoa> pessoateste = new ArrayList<>();
        Metodos teste = new Metodos(pessoateste);

        Pessoa pessoa1 = new Pessoa("Adriana", 25);
        Pessoa pessoa2 = new Pessoa("Ambrósio", 21);
        Pessoa pessoa3 = new Pessoa("Jéssica", 37);

        pessoateste.add(pessoa1);
        pessoateste.add(pessoa2);
        pessoateste.add(pessoa3);

        Assertions.assertEquals("Jéssica", teste.buscar());
    }

    // Exercicio 6
    @Test
    public void permitir_excluir_pessoa_menor_de_18_anos_e_apresentar_lista(){

        List<Pessoa> pessoas = new ArrayList<>();
        Metodos teste = new Metodos(pessoas);

        Pessoa pessoa1 = new Pessoa("Jéssica", 25);
        Pessoa pessoa2 = new Pessoa("Ambrósio", 12);
        Pessoa pessoa3 = new Pessoa("Caue", 45);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        Assertions.assertTrue(teste.excluir());
    }

}
