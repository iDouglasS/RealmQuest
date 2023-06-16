package com.mycompany.projetopoo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class StartJogo {
    
    private Personagem p1;
    private Personagem p2;
    private ListaPerguntas perguntas = new ListaPerguntas();
    private ListaPersonagem personagens = new ListaPersonagem();
    
    public Personagem getP1() {
        return p1;
    }

    public void setP1(Personagem p1) {
        this.p1 = p1;
    }

    public Personagem getP2() {
        return p2;
    }

    public void setP2(Personagem p2) {
        this.p2 = p2;
    }

    public ListaPerguntas getPerguntas() {
        return perguntas;
    }

    public void pausa(){
        //cria pequenas pausas entre os acontecimentos:
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(StartJogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void linha(){
        //faz as linhas para separar as coisas e ficar menos feio
        System.out.print("\n");
        for(int i = 0; i<=70; i++){
            System.out.print("-=");
        }
        System.out.println("\n");
    }
    
    public void rodarJogo(){
        Random sorteia = new Random();
        //chama os métodos para adicionar as listas de perguntas e personagens
        personagens.addPersonagem();
        perguntas.addPergunta();
        
        //chama o método para escolher personagem
        p1 = personagens.escolhePersonagem(1);
        linha();
        p2 = personagens.escolhePersonagem(2);
        linha();
        
        //joga os dados pra ver quem joga primeiro
        System.out.println("Os dados serão jogados para ver quem joga primeiro: \n");
        Personagem joga1;
        Personagem joga2;
        int dado1;
        int dado2;
        do{
            dado1 = p1.jogarDados();
            dado2 = p2.jogarDados();
        }while(dado1 == dado2);
        pausa();
        
        //mostra quanto cada um tirou nos dados e decide quem joga primeiro
        System.out.println("O " + p1.getNome() + " tirou " + dado1 + " no dado.");
        pausa();
        System.out.println("O " + p2.getNome() + " tirou " + dado2 + " no dado.");
        pausa();        
        if(dado1 > dado2){
            joga1 = p1;
            joga2 = p2;
            System.out.println("O " + joga1.getNome() + " Vai jogar primeiro.");
        }else {
            joga1 = p2;
            joga2 = p1;
            System.out.println("O " + joga1.getNome() + " Vai jogar primeiro.");
        }
        pausa();
        
        //variavel pra fazer contagem da rodada
        int contaRodada = 1;
        
        //loop para rodar enquanto ainda tiver perguntas ou um jogador chegar a 0 de vida
        while(!perguntas.getListaPergunta().isEmpty() && joga1.getVida() > 0 && joga2.getVida() > 0){
            linha();
            System.out.println("Rodada " + contaRodada + ": \n");
            System.out.println(joga1.status() + " Vs " + joga2.status() + "\n");
            
            //sorteia uma pergunta aleatoria da lista de perguntas e mostra
            int n = sorteia.nextInt(perguntas.getListaPergunta().size());
            System.out.println(perguntas.getListaPergunta().get(n).getEnunciado());
            
            // um for para mostrar cada alternativa da pergunta
             for(int j = 0; j < perguntas.getListaPergunta().get(n).getAlternativas().length; j++){
                 System.out.println(perguntas.getListaPergunta().get(n).getAlternativas()[j]);
             }
             
             //chama o método para cada jogador responder a pergunta
             String resposta1 = joga1.responder();
             String resposta2 = joga2.responder();
             
             pausa();
             
             //verifica se a respostas estão certas ou erradas, e chama o metodo que da dano em quem erra
             if(resposta1.equals(perguntas.getListaPergunta().get(n).getRespCorreta()) && !resposta2.equals(perguntas.getListaPergunta().get(n).getRespCorreta())){
                 System.out.println("\nApenas o " + joga1.getNome() + " acertou, a resposta correta é: " + perguntas.getListaPergunta().get(n).getRespCorreta() + ")");
                 System.out.println("Por errar o " + joga2.getNome() + " será punido!!");
                 pausa();
                 joga2.erra();
                 System.out.println("CRAAAASH!!! " + joga2.getNome() + " leva um golpe e perde 10 HP. " + joga2.status());
                 
             } else if(resposta2.equals(perguntas.getListaPergunta().get(n).getRespCorreta()) && !resposta1.equals(perguntas.getListaPergunta().get(n).getRespCorreta())){
                 System.out.println("\nApenas o " + joga2.getNome() + " acertou, a resposta correta é: " + perguntas.getListaPergunta().get(n).getRespCorreta() + ")");
                 System.out.println("Por errar o " + joga1.getNome() + " será punido!!");
                 pausa();
                 joga1.erra();
                 System.out.println("CRAAAASH!!! " + joga1.getNome() + " leva um golpe e perde 10 HP. " + joga1.status());
                 
             } else if(resposta1.equals(perguntas.getListaPergunta().get(n).getRespCorreta()) && resposta2.equals(perguntas.getListaPergunta().get(n).getRespCorreta())){
                 System.out.println("\nOs dois acertaram, ninguém será punido, a resposta correta é: " + perguntas.getListaPergunta().get(n).getRespCorreta() + ")");
             } else{
                 System.out.println("\nOs dois erraram, então os dois serão punidos, a resposta correta é: " + perguntas.getListaPergunta().get(n).getRespCorreta() + ")");
                 pausa();
                 joga1.erra();
                 System.out.println("SLAAASH!!! " + joga1.getNome() + " leva um golpe e perde 10 HP. " + joga1.status());
                 joga2.erra();
                 System.out.println("SLAAASH!!! " + joga2.getNome() + " leva um golpe e perde 10 HP. " + joga2.status());
 
             }
             contaRodada++;
             //remove a pergunta da lista de perguntas para não repetir
             perguntas.getListaPergunta().remove(n);
             pausa();
        }
        
        linha();
        //verifica quem é o vencedor ou se houve empate
        if(joga1.getVida() > joga2.getVida()){
            System.out.println("O " + joga1.getNome() + " foi o vencedor, e dominou completamente o reino da Programação!!");
            System.out.println("Totalmente derrotado, o " + joga2.getNome() + " foi exilado para outro reino para praticar o if/else.");
        } else if(joga2.getVida() > joga1.getVida()){
            System.out.println("O " + joga2.getNome() + " foi o vencedor, e dominou completamente o reino da Programação!!");
            System.out.println("Totalmente derrotado, o " + joga1.getNome() + " foi exilado para outro reino para praticar o if/else.");
        } else{
            System.out.println("Após uma grande batalha, houve um empate, então, o " + joga1.getNome() + " e o " + joga2.getNome() + " voltam para seus reinos para praticar o if/else.");
        }
        linha();
        // limpa as listas para que não apareça coisas duplicadas
        personagens.getLista().clear();
        perguntas.getListaPergunta().clear();
        
    }
    
    public void loopJogo(){
        Scanner in = new Scanner(System.in);
        
        //loop do jogo caso a pessoa queira jogar novamente
        while (true) {
            
            //faz a chamada do método onde está toda a lógica
            rodarJogo();
            // pergunta se quer recomeçar o jogo ou parar:
            String recomeca;
            while(true){
                System.out.print("Deseja jogar novamente? (Sim/Não): ");
                recomeca = in.next().toLowerCase().replaceFirst("�", "a");
                
                if(recomeca.equals("sim") || recomeca.equals("s") || recomeca.equals("n") || recomeca.equals("nao")){
                    break;
                } else{
                    System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
                }
            }
            // continua ou para
            if (recomeca.equals("sim") || recomeca.equals("s")) {
                linha();
                continue;
            } else {
                break;
            }
        }
        linha();
        System.out.println("Obrigado por jogar!! Até a próxima.");
        in.close();
        linha();
    }
    
    
}
