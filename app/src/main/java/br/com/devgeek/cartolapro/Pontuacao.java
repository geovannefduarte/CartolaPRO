package br.com.devgeek.cartolapro;

/**
 * Created by computador1 on 9/2/16.
 */
public class Pontuacao {

    private String time;
    private String cartoleiro;
    private Double variacao;
    private Double pontuacao;


    public Pontuacao(){
        super();
    }


    public Pontuacao(String time, String cartoleiro, Double variacao, Double pontuacao){
        super();
        this.time = time;
        this.cartoleiro = cartoleiro;
        this.variacao = variacao;
        this.pontuacao = pontuacao;
    }


    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getCartoleiro(){
        return cartoleiro;
    }
    public void setCartoleiro(String cartoleiro){
        this.cartoleiro = cartoleiro;
    }
    public Double getVariacao(){
        return variacao;
    }
    public void setVariacao(Double variacao){
        this.variacao = variacao;
    }
    public Double getPontuacao(){
        return pontuacao;
    }
    public void setPontuacao(Double pontuacao){
        this.pontuacao = pontuacao;
    }
}