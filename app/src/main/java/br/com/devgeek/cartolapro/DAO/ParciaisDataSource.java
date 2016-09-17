package br.com.devgeek.cartolapro.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import br.com.devgeek.cartolapro.model.Parciais;
import br.com.devgeek.cartolapro.util.SQLiteHandler;

/**
 * Created by computador1 on 9/15/16.
 */
public class ParciaisDataSource implements ParciaisDAO {

    private SQLiteDatabase database;

    private SQLiteHandler sqliteHandler;

//    private String[] allColumns = { CIFDBHelper.COLUMN_EQUIPA,
//            CIFDBHelper.COLUMN_VITORIAS, CIFDBHelper.COLUMN_EMPATES,
//            CIFDBHelper.COLUMN_DERROTAS, CIFDBHelper.COLUMN_PONTOS,
//            CIFDBHelper.COLUMN_JOGOS, CIFDBHelper.COLUMN_LUGAR };

    private String TAG = "TeamItemDataSource";

    public ParciaisDataSource(Context context){
//        sqliteHandler = SQLiteHandler.getInstance(context);
    }



    @Override
    public List<Parciais> buscarTodosOsTimes(){
        return null;
    }
}