package com.mycompany.projetopoo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPersonagem {
    private ArrayList <Personagem> listaP = new ArrayList<>();

    public ArrayList<Personagem> getLista() {
        return listaP;
    }

    public void setLista(ArrayList<Personagem> listaP) {
        this.listaP = listaP;
    }

    public void addPersonagem(){
        //adiciona os personagens
        listaP.add(new Personagem("Guerreiro"));
        listaP.add(new Personagem("Mago"));
        listaP.add(new Personagem("Ladino"));
        listaP.add(new Personagem("Sacerdote"));
    }
    
    public Personagem escolhePersonagem(int player){
        
        Scanner in = new Scanner(System.in);
        
        //mostra os personagens:
        System.out.println("Seleção de personagem: \n");
        for(int i = 0; i < listaP.size(); i++){
            System.out.println((i+1) + " - " + listaP.get(i).getNome());
        }

        //escolhe personagem:
        int escolha;
        while (true) {
            System.out.print("\nJogador " + player + " escolha seu personagem: ");
            String input = in.nextLine();

            try {
                escolha = Integer.parseInt(input);

                if (escolha >= 1 && escolha <= listaP.size()) {
                    System.out.print("O jogador " + player + " é um " + listaP.get(escolha - 1).getNome() + "\n");
                    break;
                } else {
                    System.out.println("Escolha inválida!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Escolha inválida!!");
            }
        }
        //guarda o personagem escolhido em uma variavel:
        Personagem personagemEscolhido = listaP.get(escolha - 1);
        
        //remove o personagem escolhido da lista para não aparecer pro outro player:
        listaP.remove(escolha - 1);
        
        //retorna o personagem escolhido que foi guardado na variavel acima:
        return personagemEscolhido;
    }
    
}
