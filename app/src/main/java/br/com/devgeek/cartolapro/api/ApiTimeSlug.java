package br.com.devgeek.cartolapro.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Created by computador1 on 9/15/16.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ApiTimeSlug implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<ApiTimeSlug_Atleta> atletas;

    private double patrimonio;

    private double pontos;

    private double valor_time;

    private double rodada_atual;


    public ApiTimeSlug(){
        super();
    }


    public ApiTimeSlug(List<ApiTimeSlug_Atleta> atletas, double patrimonio, double pontos, double valor_time, double rodada_atual){
        super();
        this.atletas = atletas;
        this.patrimonio = patrimonio;
        this.pontos = pontos;
        this.valor_time = valor_time;
        this.rodada_atual = rodada_atual;
    }
    public List<ApiTimeSlug_Atleta> getAtletas(){
        return atletas;
    }
    public void setAtletas(List<ApiTimeSlug_Atleta> atletas){
        this.atletas = atletas;
    }
    public double getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }
    public double getPontos() {
        return pontos;
    }
    public void setPontos(double pontos) {
        this.pontos = pontos;
    }
    public double getValor_time() {
        return valor_time;
    }
    public void setValor_time(double valor_time) {
        this.valor_time = valor_time;
    }
    public double getRodada_atual() {
        return rodada_atual;
    }
    public void setRodada_atual(double rodada_atual) {
        this.rodada_atual = rodada_atual;
    }
}