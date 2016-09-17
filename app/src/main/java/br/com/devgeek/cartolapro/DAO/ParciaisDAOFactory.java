package br.com.devgeek.cartolapro.DAO;

import android.content.Context;

/**
 * Created by computador1 on 9/15/16.
 */
public class ParciaisDAOFactory {

    private final static int SQLite = 1;

    public static ParciaisDAO getTeamItemDAO(Context ctx, int activeDB) {

        ParciaisDAO parciaisDAO;

        switch(activeDB) {
            case SQLite:
                parciaisDAO = new ParciaisDataSource(ctx);
                return parciaisDAO;
            default:
                return null;
        }

    }
}
