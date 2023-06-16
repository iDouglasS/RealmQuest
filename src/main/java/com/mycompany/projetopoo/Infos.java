package com.mycompany.projetopoo;

public class Infos {
    
    private String nomeJogo = "RealmQuest: Desafio dos Códigos";
    private String d1 = "Lucas Eduardo de Andrade - RA: 12316018";
    private String d2 = "Matheus Silva Leite - RA: 12316020";
    private String d3 = "Vitor Hugo Lima de Almeida - RA: 12315634";
    private String d4 = "Douglas Silva Santana - 12318870";
    
    private String explica = "Seleção de personagem: Cada jogador deverá escolher um dos 4 personagens jogáveis. " +
                             "\nSorte no dado: Após a seleção dos personagens, cada jogador irá jogar um dado, o jogador com o maior valor iniciará a rodada,"
            + "               \nse os dados derem valores iguais, será necessário rolar os dados novamente até que os números sejam diferentes. " +
              "               \nRodada: Após determinar a sorte no dado, a partida inicia, a partida possui 15 rodadas que será intercalada entre os dois jogadores,"
            + "               \na cada ação, a vez passa para o outro jogador, se um personagem errar a resposta da pergunta, ele perderá 10 pontos de vida. " +
              "               \nVida: A vida representa a saúde do personagem, ao iniciar a partida, cada personagem possui 100 pontos de vida, se a vida chegar a zero,"
            + "               \no jogador perde, caso as rodadas acabem vence o jogador com maior vida, se os pontos de vida forem iguais temos um empate.";
    
    private String quest = "Uma criatura misteriosa convoca heróis de diferentes reinos para uma competição, na qual o domínio do reino da programação está em jogo."
            + "            \nCada herói terá que enfrentar uma série de perguntas e fornecer respostas corretas para avançar no embate e ser vitorioso.";
    
    
    public String getD1() {
        return d1;
    }

    public String getD2() {
        return d2;
    }

    public String getD3() {
        return d3;
    }
    
    public String getD4() {
        return d4;
    }
    
    private void linha(){
        System.out.print("\n");
        for(int i = 0; i<=70; i++){
            System.out.print("-=");
        }
        System.out.println("\n");
    }
    
    public void mostraInfo(){
        linha();
        System.out.println("Desenvolvedores: \n");
        System.out.println(this.d1);
        System.out.println(this.d2);
        System.out.println(this.d3);
        System.out.println(this.d4);
        linha();
        System.out.println("Explicação: \n");
        explica = explica.replaceAll("\\. ", ".\n");
        System.out.println(explica);
        linha();
        System.out.println("Bem vindo ao [" + this.nomeJogo + "] !!!!");
        linha();
        System.out.println("A missão: \n");
        System.out.println(quest);
        linha();
    }
}