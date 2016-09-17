package br.com.devgeek.cartolapro.DAO;

import java.util.List;

import br.com.devgeek.cartolapro.model.Parciais;

/**
 * Created by computador1 on 9/15/16.
 */
public interface ParciaisDAO {

    public List<Parciais> buscarTodosOsTimes();
}