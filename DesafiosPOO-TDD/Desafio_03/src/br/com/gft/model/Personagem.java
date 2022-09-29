package br.com.gft.model;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;

    private static int personagem = 0;

    public static int quantidadePersonagens(){
        return personagem;
    }
    public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;

        personagem++;
    }

    public Personagem(){
        personagem++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public float getXp() {
        return xp;
    }
    public void setXp(float xp) {
        this.xp = xp;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void lvlUp() {
        while (getLevel() >= 1) {
            int level = getLevel() + 1;
            int mana = getMana() + 1;
            int inteligencia = getInteligencia() + 1;
            int vida = getVida() + 1;
            int forca = getForca() + 1;
            System.out.println("Level: " + level);
            System.out.println("Mana: " + mana);
            System.out.println("Vida: " + vida);
            System.out.println("Inteligência: " + inteligencia);
            System.out.println("Força: " + forca);
            break;
        }
    }

    public void imprimirAtributos(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Level: " + getLevel());
        System.out.println("Mana: " + getMana());
        System.out.println("XP: " + getXp());
        System.out.println("Inteligência: " + getInteligencia());
        System.out.println("Força: " +getForca());
    }
}
