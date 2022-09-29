package br.com.gft.model;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }
    public Vendedor(){
    }
    @Override
    public double bonificacao() {
        double salario = getSalario() + 3000;
        System.out.println("Vendedor: " + salario);
        return salario;
    }

}
