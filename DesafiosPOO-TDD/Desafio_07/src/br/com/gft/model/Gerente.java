package br.com.gft.model;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);

    }
    public Gerente() {
    }

    @Override
    public double bonificacao() {
        double salario = getSalario() + 10000;
        System.out.println("Gerente: " + salario);
        return salario;
    }

}
