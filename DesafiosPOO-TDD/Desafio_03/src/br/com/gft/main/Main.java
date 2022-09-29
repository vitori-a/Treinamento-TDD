package br.com.gft.main;

import br.com.gft.model.Guerreiro;
import br.com.gft.model.Mago;
import br.com.gft.model.Personagem;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Personagem m1 = new Mago("Wanda", 3, 20, 0, 50, 10, 1, Collections.singletonList("telecinese"));
        Personagem m2 = new Mago("Harry Potter", 2, 10,3, 21,2, 3, Collections.singletonList("levitar"));

        Personagem g1 = new Guerreiro("Gandalf", 3, 20, 0, 50, 10, 1, Collections.singletonList("mortal"));
        Personagem g2 = new Guerreiro("Thor", 4,6,30,25,30,4, Collections.singletonList("voar"));

        System.out.println("Quantidade de Personagens Criados: " + Personagem.quantidadePersonagens());

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o personagem desejado: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.printf("Digite: ");
        int escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("~GUERREIRO~");
                g1.imprimirAtributos();
                ((Guerreiro) g1).aprenderHabilidade();
                break;
            case 2:
                System.out.println("~MAGO~");
                m1.imprimirAtributos();
                ((Mago) m1).aprenderMagia();
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("\nAtacar?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.printf("Digite: ");
        int escolha2 = ler.nextInt();

        switch (escolha2) {
            case 1:
                if (escolha == 1) {
                    ((Guerreiro) g1).attack();
                    g1.lvlUp();
                } else if (escolha == 2) {
                    ((Mago) m1).attack();
                    m1.lvlUp();
                } else System.out.println("Opção inválida");
            case 2:
        }
    }
}