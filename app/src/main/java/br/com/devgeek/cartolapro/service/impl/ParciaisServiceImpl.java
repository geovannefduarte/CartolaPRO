package br.com.devgeek.cartolapro.service.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.devgeek.cartolapro.Pontuacao;
import br.com.devgeek.cartolapro.api.ApiAtletasPontuados;
import br.com.devgeek.cartolapro.api.ApiTimeSlug;
import br.com.devgeek.cartolapro.api.ApiTimeSlug_Atleta;
import br.com.devgeek.cartolapro.service.ParciaisService;

import static br.com.devgeek.cartolapro.util.HttpURLConnectionUtil.sendGetRequest;

/**
 * Created by computador1 on 9/15/16.
 */
public class ParciaisServiceImpl implements ParciaisService {

    @Override
    public List<Pontuacao> buscarPariais(boolean reload){

        ObjectMapper mapper = null;
        ApiAtletasPontuados atletasPontuados = null;
        List<Pontuacao> listaParciais = new ArrayList<Pontuacao>();

        try {
            mapper = new ObjectMapper();
            atletasPontuados = mapper.readValue(sendGetRequest("https://api.cartolafc.globo.com/atletas/pontuados"), ApiAtletasPontuados.class);
        } catch (IOException e){
            e.printStackTrace();
        }

        for (int i=0; i < 4; i++){

            Pontuacao pontuacao = new Pontuacao();

            if (i==0){

                double parcial = 0.0;

                if (atletasPontuados != null){
                    for (String jogador : buscarListaJogadores(mapper, "arkenstone-fc"))
                        if (atletasPontuados.getAtletas().get(jogador) != null)
                            parcial += atletasPontuados.getAtletas().get(jogador).getPontuacao();
                }

                pontuacao.setTime("Arkenstone FC");
                pontuacao.setCartoleiro("Geovanne Duarte");
                pontuacao.setPontuacao(parcial);
                pontuacao.setVariacao(0.0);

            } else if (i==1 && reload == true){

                double parcial = 0.0;

                if (atletasPontuados != null){
                    for (String jogador : buscarListaJogadores(mapper, "dj-soccer-club"))
                        if (atletasPontuados.getAtletas().get(jogador) != null)
                            parcial += atletasPontuados.getAtletas().get(jogador).getPontuacao();
                }

                pontuacao.setTime("DJ Soccer Club");
                pontuacao.setCartoleiro("Djonnathan Duarte");
                pontuacao.setPontuacao(parcial);
                pontuacao.setVariacao(0.0);

            } else if (i==2 && reload == true){

                double parcial = 0.0;

                if (atletasPontuados != null){
                    for (String jogador : buscarListaJogadores(mapper, "caiaponiaduarte-fc"))
                        if (atletasPontuados.getAtletas().get(jogador) != null)
                            parcial += atletasPontuados.getAtletas().get(jogador).getPontuacao();
                }

                pontuacao.setTime("CaiapôniaDuarte FC");
                pontuacao.setCartoleiro("Genésio Duarte");
                pontuacao.setPontuacao(parcial);
                pontuacao.setVariacao(0.0);

            } else {

                double parcial = 0.0;

                if (atletasPontuados != null){
                    for (String jogador : buscarListaJogadores(mapper, "auto-pecas-santos-ec"))
                        if (atletasPontuados.getAtletas().get(jogador) != null)
                            parcial += atletasPontuados.getAtletas().get(jogador).getPontuacao();
                }

                pontuacao.setTime("Auto Pecas Santos EC");
                pontuacao.setCartoleiro("Paulo Henrique Santos");
                pontuacao.setPontuacao(parcial);
                pontuacao.setVariacao(0.0);
            }

            listaParciais.add(pontuacao);

        }

        return listaParciais;
    }

    private List<String> buscarListaJogadores(ObjectMapper mapper, String slug){

        List<String> listaJogadores = new ArrayList<String>();

        try {

            ApiTimeSlug apiTimeSlug = mapper.readValue(sendGetRequest("https://api.cartolafc.globo.com/time/"+slug), ApiTimeSlug.class);

            for (ApiTimeSlug_Atleta atleta : apiTimeSlug.getAtletas()){
                listaJogadores.add(String.valueOf(atleta.getAtleta_id()));
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        return listaJogadores;
    }

    public double buscarPontuacaTime(ObjectMapper mapper, String slug){

        double pontos = 0.0;

        try {
            ApiTimeSlug apiTimeSlug = mapper.readValue(sendGetRequest("https://api.cartolafc.globo.com/time/"+slug), ApiTimeSlug.class);

            pontos = apiTimeSlug.getPontos();
        } catch (IOException e){
            e.printStackTrace();
        }

        return pontos;
    }
}