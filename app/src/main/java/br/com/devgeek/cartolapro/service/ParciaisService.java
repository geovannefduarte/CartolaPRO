package br.com.devgeek.cartolapro.service;

import java.util.List;

import br.com.devgeek.cartolapro.Pontuacao;

/**
 * Created by computador1 on 9/15/16.
 */
public interface ParciaisService {

    public List<Pontuacao> buscarPariais(boolean reload);
}