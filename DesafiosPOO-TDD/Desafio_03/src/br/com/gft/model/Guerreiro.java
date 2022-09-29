package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
    private List<String> habilidade;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidade = habilidade;
    }

    public Guerreiro(){
    }
    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void lvlUp() {
        while (getLevel() >= 1) {
            int level = getLevel() + 1;
            int vida = getVida() + 1;
            int forca = getForca() + 1;
            System.out.println(" + Level Up: " + level);
            System.out.println(" + Vida: " + vida);
            System.out.println(" + Força: " + forca);
            break;
        }
    }
    public void attack(){
        Random gerador = new Random();

        int attack = gerador.nextInt(300) + (getLevel() * getForca());
        System.out.println("Força de ataque: " + attack);

    }

    public List<String> aprenderHabilidade(){
        System.out.println("Habilidade: " + getHabilidade());
        return habilidade;
    }
}
