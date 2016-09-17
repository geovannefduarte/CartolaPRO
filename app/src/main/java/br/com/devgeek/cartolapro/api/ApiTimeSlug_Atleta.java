package br.com.devgeek.cartolapro.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by computador1 on 9/15/16.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ApiTimeSlug_Atleta implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String apelido;
    private String foto;

    private Integer atleta_id;
    private Integer posicao_id;


    public ApiTimeSlug_Atleta() {
        super();
    }


    public ApiTimeSlug_Atleta(String nome, String apelido, String foto, Integer atleta_id, Integer posicao_id){
        super();
        this.nome = nome;
        this.apelido = apelido;
        this.foto = foto;
        this.atleta_id = atleta_id;
        this.posicao_id = posicao_id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getApelido(){
        return apelido;
    }
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
    public String getFoto(){
        return foto;
    }
    public void setFoto(String foto){
        this.foto = foto;
    }
    public Integer getAtleta_id(){
        return atleta_id;
    }
    public void setAtleta_id(Integer atleta_id){
        this.atleta_id = atleta_id;
    }
    public Integer getPosicao_id() {
        return posicao_id;
    }
    public void setPosicao_id(Integer posicao_id){
        this.posicao_id = posicao_id;
    }
}