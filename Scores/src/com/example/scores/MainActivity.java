package com.example.scores;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

import com.example.scores.CurrentGameDb;

public class MainActivity extends Activity {
	
	CurrentGameDb CGdb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageButton imgbtn = (ImageButton) findViewById(R.id.imgbtn1);
		imgbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {																		
				// TODO Auto-generated method stub
				Intent myintent = new Intent(v.getContext(),NofPlayers.class);
				startActivityForResult(myintent, 0);
			}
		});
		/*
		CGdb = new CurrentGameDb(getApplicationContext());
		long CGid = CGdb.CreateGame("2");*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
