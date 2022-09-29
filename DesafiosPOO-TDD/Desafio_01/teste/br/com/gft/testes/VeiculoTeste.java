package br.com.gft.testes;
import br.com.gft.model.Veiculo;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VeiculoTeste {

    private Veiculo veiculo;

    @Before
    public void setup(){
        veiculo = new Veiculo();
    }

    @Test
    public void deve_permitir_acelerar_veiculo(){

        veiculo.setVelocidade(30);

        Assertions.assertEquals(50, veiculo.acelerar());
    }

    @Test
    public void deve_permitir_abastecer_tanque_veiculo(){

        veiculo.setLitrosCombustivel(40);

        Assertions.assertEquals(60, veiculo.abastecer(20));
    }

    @Test
    public void deve_permitir_pintar_veiculo(){

        veiculo.setCor("azul");

        Assertions.assertEquals("vermelho", veiculo.pintar("vermelho"));
    }

    //certinho
    @Test
    public void deve_permitir_ligar_veiculo(){

        veiculo.setLigado(false);

        Assertions.assertFalse(veiculo.ligar());
    }

    @Test
    public void nao_deve_permitir_ligar_veiculo_que_se_encontra_ligado(){

        veiculo.setLigado(true);

        Assertions.assertTrue(veiculo.ligar());
    }

    @Test
    public void deve_permitir_desligar_veiculo(){

       veiculo.setLigado(true);

       veiculo.setVelocidade(0);

        Assertions.assertTrue(veiculo.desligar());
    }

    @Test
    public void nao_deve_permitir_desligar_veiculo(){

        veiculo.setLigado(true);

        veiculo.setVelocidade(15);

        Assertions.assertFalse(veiculo.desligar());
    }

}