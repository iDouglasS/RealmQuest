package com.mycompany.projetopoo;

public class ProjetoPOO {

    public static void main(String[] args) {
        
        //informações dos devs e explicação do jogo:
        Infos info = new Infos();
        info.mostraInfo();
        
        
        // inicia o jogo:
        StartJogo jogo = new StartJogo();
        jogo.loopJogo();
    
    }
}
