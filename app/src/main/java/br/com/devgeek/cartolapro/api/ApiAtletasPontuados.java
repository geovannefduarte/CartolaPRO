package br.com.devgeek.cartolapro.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by computador1 on 9/15/16.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ApiAtletasPontuados implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rodada;

    private Map<String, ApiAtletasPontuados_PontuacaoAtleta> atletas;

    private String mensagem;


    public ApiAtletasPontuados(){
        super();
    }


    public ApiAtletasPontuados(Integer rodada, Map<String, ApiAtletasPontuados_PontuacaoAtleta> atletas, String mensagem){
        super();
        this.rodada = rodada;
        this.atletas = atletas;
        this.mensagem = mensagem;
    }


    public Integer getRodada(){
        return rodada;
    }
    public void setRodada(Integer rodada){
        this.rodada = rodada;
    }
    public Map<String, ApiAtletasPontuados_PontuacaoAtleta> getAtletas(){
        return atletas;
    }
    public void setAtletas(Map<String, ApiAtletasPontuados_PontuacaoAtleta> atletas){
        this.atletas = atletas;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}