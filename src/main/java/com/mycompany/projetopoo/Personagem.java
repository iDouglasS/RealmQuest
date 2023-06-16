package com.mycompany.projetopoo;

import java.util.Random;
import java.util.Scanner;

public class Personagem {
    private String nome;
    private int vida;

  public Personagem(String nome){
    this.nome = nome;
    this.vida = 100;
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

    public int jogarDados(){
        Random dado = new Random();
        return dado.nextInt(6)+1;
    }
    
    public String responder() {
        //o personagem escolhe entre as alternativas e retorna a alternativa escolhida
        Scanner in = new Scanner(System.in);
        String resposta, confirma;
        while(true){
            System.out.print("\n" + this.nome + ", qual será a sua escolha a), b), c) ou d)? ");
            resposta = in.next().toLowerCase();
            if(resposta.equals("a") || resposta.equals("b") || resposta.equals("c") || resposta.equals("d")){
                do{
                    System.out.print("\n" + this.nome + ", tem certeza da sua resposta? ");
                    confirma = in.next().toLowerCase().replaceFirst("�", "a");
                    if(confirma.equals("s") || confirma.equals("sim") || confirma.equals("n") || confirma.equals("nao")){
                        break;
                    } else{
                        System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
                    }
                }while(true);
                if(confirma.equals("s") || confirma.equals("sim")){
                    break;
                }
                
            }else {
                System.out.println("Não teste minha paciência, essa alternativa não existe!!");
            }
        }
        return resposta;
    }

    public void erra(){
        //tira vida do personagem ao errar
        this.vida -= 10;
    }
    
    public String status(){
        //mostra o nome e a vida do personagem
        String status = "[" + this.nome + " - " + this.vida + " HP]";
        return status;
    }

}
