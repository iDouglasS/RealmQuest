package com.mycompany.projetopoo;

public class Pergunta {
    private String enunciado;
    private String[] alternativas;
    private String respCorreta;

    public Pergunta(String enunciado, String[] alternativas, String respCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respCorreta = respCorreta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public String getRespCorreta() {
        return respCorreta;
    }

    public void setRespCorreta(String respCorreta) {
        this.respCorreta = respCorreta;
    }
}