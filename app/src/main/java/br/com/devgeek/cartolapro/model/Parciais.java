package br.com.devgeek.cartolapro.model;

import java.util.List;

/**
 * Created by computador1 on 9/15/16.
 */
public class Parciais {

    // Contacts table name
    public static final String TABLE = "parciais";

    public static final String CREATE_TABLE = "CREATE TABLE "+Parciais.TABLE+" (id INTEGER PRIMARY KEY AUTOINCREMENT, time_id INTEGER nome TEXT, nome_cartola TEXT, slug TEXT)";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS "+Parciais.TABLE;


    private long id;

    private long time_id;           // 6957528
    private String nome;            // Arkenstone FC
    private String nome_cartola;    // Geovanne Duarte
    private String slug;            // arkenstone-fc

    private List<Integer> atletas;


    public Parciais(long id, long time_id, String nome, String nome_cartola, String slug, List<Integer> atletas){
        this.id = id;
        this.time_id = time_id;
        this.nome = nome;
        this.nome_cartola = nome_cartola;
        this.slug = slug;
        this.atletas = atletas;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getTime_id() {
        return time_id;
    }
    public void setTime_id(long time_id) {
        this.time_id = time_id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome_cartola() {
        return nome_cartola;
    }
    public void setNome_cartola(String nome_cartola) {
        this.nome_cartola = nome_cartola;
    }
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public List<Integer> getAtletas() {
        return atletas;
    }
    public void setAtletas(List<Integer> atletas) {
        this.atletas = atletas;
    }
}
