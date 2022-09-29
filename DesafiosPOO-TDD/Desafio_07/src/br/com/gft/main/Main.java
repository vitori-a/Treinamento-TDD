package br.com.gft.main;
import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Cleiton", 57, 7500);
        Supervisor supervisor = new Supervisor("Isabela", 33, 4300);
        Vendedor vendedor = new Vendedor("Josefa", 25, 1600);

        gerente.bonificacao();
        supervisor.bonificacao();
        vendedor.bonificacao();
    }
}
