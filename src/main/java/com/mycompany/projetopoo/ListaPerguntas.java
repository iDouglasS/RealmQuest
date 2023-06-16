
package com.mycompany.projetopoo;
import java.util.ArrayList;

public class ListaPerguntas {
    private ArrayList <Pergunta> listaPergunta = new ArrayList<>();

    public ArrayList<Pergunta> getListaPergunta() {
        return listaPergunta;
    }

    public void setListaPergunta(ArrayList<Pergunta> listaPergunta) {
        this.listaPergunta = listaPergunta;
    }
    
    public void addPergunta() {
        //adiciona as perguntas / respostas:
        listaPergunta.add(new Pergunta("O que é programação orientada a objetos?", 
                
                          new String[]{"a) Um paradigma de programação baseado em objetos", 
                                       "b) Um tipo de linguagem de programação", 
                                       "c) Um método de depuração de código", 
                                       "d) Um tipo de estrutura de dados"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é uma classe em Java?", 
                
                          new String[]{"a) Uma estrutura de dados para armazenar valores", 
                                       "b) Um tipo de variável", 
                                       "c) Um modelo para criar objetos", 
                                       "d) Uma função para executar código"}, "c"));
        
        listaPergunta.add(new Pergunta("O que é herança em programação orientada a objetos?", 
                
                          new String[]{"a) A capacidade de criar novas classes a partir de classes existentes", 
                                       "b) A capacidade de compartilhar código entre classes", 
                                       "c) A capacidade de armazenar dados em classes", 
                                       "d) A capacidade de executar código em classes"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é polimorfismo em programação orientada a objetos?", 
                
                          new String[]{"a) A capacidade de um objeto ter muitos atributos", 
                                       "b) A capacidade de um objeto executar muitas funções", 
                                       "c) A capacidade de um objeto armazenar muitos valores", 
                                       "d) A capacidade de um objeto assumir muitas formas"}, "d"));
        
        listaPergunta.add(new Pergunta("O que é encapsulamento em programação orientada a objetos?", 
                
                         new String[]{"a) A prática de compartilhar código entre objetos", 
                                      "b) A prática de esconder a implementação interna dos objetos", 
                                      "c) A prática de armazenar dados em objetos", 
                                      "d) A prática de executar código em objetos"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é uma interface em Java?", 
                
                          new String[]{"a) Um tipo especial de classe", 
                                       "b) Uma classe abstrata com apenas métodos abstratos", 
                                       "c) Um contrato entre classes", 
                                       "d) Um tipo especial de variável"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é uma exceção em Java?", 
                
                          new String[]{"a) Um tipo especial de variável", 
                                       "b) Um tipo especial de classe", 
                                       "c) Um método para depurar código", 
                                       "d) Um evento que ocorre durante a execução do programa e interrompe o fluxo normal do programa"}, "d"));
        
        listaPergunta.add(new Pergunta("O que é um construtor em Java?", 
                
                          new String[]{"a) Um método especial usado para criar e inicializar objetos", 
                                       "b) Um tipo especial de variável", 
                                       "c) Um tipo especial de classe", 
                                       "d) Um método para depurar código"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é sobrecarga de métodos em Java?", 
                
                         new String[]{"a) A prática de definir vários métodos com o mesmo nome e os mesmos parâmetros", 
                                      "b) A prática de definir vários métodos com nomes diferentes, mas com os mesmos parâmetros", 
                                      "c) A prática de definir vários métodos com o mesmo nome, mas com parâmetros diferentes", 
                                      "d) A prática de definir vários métodos com nomes e parâmetros diferentes"}, "c"));
        
        listaPergunta.add(new Pergunta("O que é uma classe abstrata em Java?", 
                
                          new String[]{"a) Uma classe que pode ser instanciada e usada diretamente", 
                                       "b) Uma classe que não pode ser instanciada e é usada como base para outras classes", 
                                       "c) Um tipo especial de interface", 
                                       "d) Um tipo especial de variável"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é um método abstrato em Java?", 
                
                          new String[]{"a) Um método sem implementação que deve ser implementado por subclasses", 
                                       "b) Um método com implementação que pode ser usado diretamente", 
                                       "c) Um tipo especial de construtor", 
                                       "d) Um tipo especial de variável"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é um pacote em Java?", 
                
                          new String[]{"a) Um namespace para organizar classes e interfaces relacionadas", 
                                       "b) Um tipo especial de classe", 
                                       "c) Um tipo especial de interface", 
                                       "d) Um método especial usado para criar e inicializar objetos"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é uma variável de instância em Java?", 
                
                          new String[]{"a) Um tipo especial de método", 
                                       "b) Uma variável associada a uma classe, não a uma instância", 
                                       "c) Uma variável associada a uma instância de uma classe", 
                                       "d) Um tipo especial de construtor"}, "c"));
        
        listaPergunta.add(new Pergunta("O que é uma variável de classe em Java?", 
                
                          new String[]{"a) Uma variável associada a uma instância de uma classe", 
                                       "b) Uma variável associada a uma classe, não a uma instância", 
                                       "c) Um método associado a uma instância de uma classe", 
                                       "d) Um método com implementação que pode ser usado diretamente"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é um método estático em Java?", 
                
                          new String[]{"a) Um método com implementação que pode ser usado diretamente", 
                                       "b) Uma variável associada a uma classe, não a uma instância", 
                                       "c) Uma variável associada a uma classe, não a uma instância", 
                                       "d) Um método associado a uma classe, não a uma instância"}, "d"));
        
    }
    
}
