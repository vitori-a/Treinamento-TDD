package br.com.gft.testes;

import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;
import org.junit.jupiter.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FuncionarioTest {

    private Gerente gerente;
    private Supervisor supervisor;
    private Vendedor vendedor;

    @Before
    public void setUp(){
        gerente = new Gerente();
        supervisor = new Supervisor();
        vendedor = new Vendedor();
    }

    @Test
    public void deve_calcular_a_bonificacao_do_gerente(){
        gerente.setSalario(5800);

        Assertions.assertEquals(15800, gerente.bonificacao());
    }

    @Test
    public void deve_calcular_a_bonificacao_do_supervisor(){
        supervisor.setSalario(3100);

        Assertions.assertEquals(8100, supervisor.bonificacao());
    }

    @Test
    public void deve_calcular_a_bonificacao_do_vendedor(){
        vendedor.setSalario(1600.50);

        Assertions.assertEquals(4600.50, vendedor.bonificacao());
    }
}
