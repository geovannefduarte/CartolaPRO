package br.com.devgeek.cartolapro.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.devgeek.cartolapro.model.Parciais;

/**
 * Created by computador1 on 9/15/16.
 */
public class SQLiteHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "devgeek_cartola.db";

    // Contacts table name
    private static final String TABLE_SHOPS = "shops";

    // Shops Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_SH_ADDR = "shop_address";

    public SQLiteHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(Parciais.CREATE_TABLE);




//        // Gets the data repository in write mode
//        SQLiteDatabase db = SQLiteHandler.getWritableDatabase();
//
//        // Create a new map of values, where column names are the keys
//        ContentValues values = new ContentValues();
//        values.put("time_id", 6957528);
//        values.put("nome", "Arkenstone FC");
//        values.put("nome_cartola", "Geovanne Duarte");
//        values.put("slug", "arkenstone-fc");
//
//        // Insert the new row, returning the primary key value of the new row
//        long newRowId = db.insert(Parciais.TABLE, null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL(Parciais.DROP_TABLE);
        onCreate(db);
    }


}