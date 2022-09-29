package br.com.gft.model;

public class Supervisor extends Funcionario{

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }
    public Supervisor(){
    }
    @Override
    public double bonificacao() {
        double salario = getSalario() + 5000;
        System.out.println("Supervisor: " + salario);
        return salario;
    }

}
