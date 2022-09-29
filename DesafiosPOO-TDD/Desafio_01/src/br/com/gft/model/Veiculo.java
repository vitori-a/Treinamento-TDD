package br.com.gft.model;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private boolean isLigado;
    private float km;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int acelerar() {
        int motor = getVelocidade() + 20;
        System.out.println("A velocidade é igual a " + motor);
        return motor;
    }

    public int abastecer(int combustivel) {
        int tanque = combustivel + getLitrosCombustivel();
        if(tanque <= 60)
            System.out.println("Enchendo tanque... " + tanque);
        else
            System.out.println("Tanque está cheio! " + tanque);
        return tanque;
    }

    public void frear() {
        int velocidade = getVelocidade();
        if(velocidade >= 20 && isLigado == true)
            velocidade = getVelocidade() - 20;
        System.out.println("Freando veiculo! Velocidade: " + velocidade);
    }

    public String pintar(String cor) {
        System.out.println("Cor anterior do carro: " + getCor());
        System.out.println("Pintando o carro de " + cor);
        return cor;
    }

    public boolean ligar() {
        if(isLigado() == true) {
            System.out.println("Carro já se encontra ligado");
            return true;
        } else {
            System.out.println("Ligando carro");
            return false;
        }
    }

    public boolean desligar() {
        if(isLigado() == true && getVelocidade() > 0) {
            System.out.println("O veiculo não pode ser deligado, pois a velocidade é maior que 0");
            return false;
            
        } else if (isLigado() == true && getVelocidade() == 0){
            System.out.println("Desligando veiculo");
            return true;

        } else {
            System.out.println("Veiculo se encontra desligado");
            return true;
        }
    }

    public void descricaoVeiculo(){
        System.out.println("Descrição do Veículo");
        System.out.println("-----------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor atual: " + getCor());
        System.out.println("-----------------------------");

    }
}
