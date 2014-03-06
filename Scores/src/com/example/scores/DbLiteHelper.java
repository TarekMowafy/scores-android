package com.example.scores;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbLiteHelper extends SQLiteOpenHelper {
	
	protected static final String TABLE_NAME_CURRENT_GAME = "CurrentGame";
	protected static final String CURRENT_GAME_ID_COLUMN_NAME = "CG_Id";
	protected static final String NO_OF_PLAYERS_COLUMN_NAME = "NumberOfPlayers";
	protected static final String WINNER_COLUMN_NAME = "Winner";
	
	protected static final String TABLE_NAME_PLAYER = "PLAYER";
	protected static final String PLAYER_ID_COLUMN_NAME = "P_Id";
	protected static final String PLAYER_NAME_COLUMN_NAME = "playerName";
	protected static final String CURRENT_GAME_ID_COLUMN_NAME_FK = "CG_Id";
	protected static final String ROUND1_COLUMN_NAME = "RoundOne";
	protected static final String ROUND2_COLUMN_NAME = "RoundTwo";
	protected static final String ROUND3_COLUMN_NAME = "RoundThree";
	protected static final String ROUND4_COLUMN_NAME = "RoundFour";
	protected static final String ROUND5_COLUMN_NAME = "RoundFive";
	protected static final String ROUND6_COLUMN_NAME = "RoundSix";
	protected static final String TOTAL_SCORE_COLUMN_NAME = "TotalScore";
	
	private static final String DATABASE_NAME = "ScoresDb.db";
	private static final int DATABASE_VERSION = 1;
	private static final String TABLES_RELATION ="FK_GamePlayers";
	Context context;
	SQLiteDatabase db;
	
	public DbLiteHelper(Context context) {
		
	    super(context, DATABASE_NAME, null, DATABASE_VERSION);
	    this.context=context;
	  }
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		
		StringBuilder GameTablebuilder = new StringBuilder();
		GameTablebuilder.append("create table "+ TABLE_NAME_CURRENT_GAME);
		GameTablebuilder.append("("+ CURRENT_GAME_ID_COLUMN_NAME + " integer primary key autoincrement,");
		GameTablebuilder.append(NO_OF_PLAYERS_COLUMN_NAME+ " integer,");
		GameTablebuilder.append(WINNER_COLUMN_NAME+ " text)");
		
		//Creates the current game table
		db.execSQL(GameTablebuilder.toString());
		
		StringBuilder PlayerTablebuilder = new StringBuilder();
		PlayerTablebuilder.append("create table "+ TABLE_NAME_PLAYER);
		PlayerTablebuilder.append("("+ PLAYER_ID_COLUMN_NAME + " integer primary key autoincrement,");
		PlayerTablebuilder.append(PLAYER_NAME_COLUMN_NAME + " text, ");
	    PlayerTablebuilder.append(CURRENT_GAME_ID_COLUMN_NAME_FK+ " integer,");
		PlayerTablebuilder.append(ROUND1_COLUMN_NAME+ " integer, ");
		PlayerTablebuilder.append(ROUND2_COLUMN_NAME+ " integer, ");
		PlayerTablebuilder.append(ROUND3_COLUMN_NAME+ " integer, ");
		PlayerTablebuilder.append(ROUND4_COLUMN_NAME+ " integer, ");
		PlayerTablebuilder.append(ROUND5_COLUMN_NAME+ " integer, ");
		PlayerTablebuilder.append(ROUND6_COLUMN_NAME+ " integer, ");
		PlayerTablebuilder.append(TOTAL_SCORE_COLUMN_NAME+ " integer, ");
		PlayerTablebuilder.append("CONSTRAINT "+ TABLES_RELATION +" FOREIGN KEY ("+CURRENT_GAME_ID_COLUMN_NAME_FK+") REFERENCES "+TABLE_NAME_CURRENT_GAME+");");
		
		//Creates the player table
		db.execSQL(PlayerTablebuilder.toString());  
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("drop table if exists "+TABLE_NAME_CURRENT_GAME);
		db.execSQL("drop table if exists "+TABLE_NAME_PLAYER);
		Log.d("db update","onUpgrade");
		onCreate(db);
		
	}
	
}
