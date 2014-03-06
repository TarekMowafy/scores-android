package com.example.scores;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CurrentGameDb {
	SQLiteDatabase db;
	DbLiteHelper helper;
	
	//CONSTRUCTORS
		public CurrentGameDb(Context context){
			helper = new DbLiteHelper(context); 
			db = helper.getWritableDatabase();
		};
		
	//Functions
		public long CreateGame(String NofPlayers){
			
			ContentValues values = new ContentValues();
			values.put(DbLiteHelper.NO_OF_PLAYERS_COLUMN_NAME,NofPlayers);
			long id = db.insert(DbLiteHelper.TABLE_NAME_CURRENT_GAME,null,values);
			db.close();
			return id;
	}

}
