package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        v1.setMarca("BMW");
        v1.setModelo("Série I");
        v1.setCor("azul");
        v1.setVelocidade(9);
        v1.setLitrosCombustivel(20);
        v1.setLigado(false);

        v1.descricaoVeiculo();
        v1.acelerar();
        v1.abastecer(45);
        v1.frear();
        v1.pintar("Lilás");
        v1.ligar();
        v1.desligar();
    }

}
