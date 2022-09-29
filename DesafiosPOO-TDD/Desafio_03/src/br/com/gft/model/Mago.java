package br.com.gft.model;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
    private List<String> magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magia = magia;
    }

    public Mago(){
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    @Override
    public void lvlUp() {
        while (getLevel() >= 1) {
            int level = getLevel() + 1;
            int mana = getMana() + 1;
            int inteligencia = getInteligencia() + 1;
            System.out.println(" + Level Up: " + level);
            System.out.println(" + Mana: " + mana);
            System.out.println(" + Inteligência: " + inteligencia);
            break;
        }
    }

    public void attack(){
        Random gerador = new Random();

        int attack = gerador.nextInt(300) + (getLevel() * getInteligencia());
        System.out.println("Força de ataque: " + attack);
    }


    public List<String> aprenderMagia(){
        System.out.println("Poder: " + getMagia());
        return magia;
    }
}