package com.example.team04project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CreateComment extends Activity {
	public void postComment(View view){
		EditText text = (EditText) findViewById(R.id.comment);
		String counterName = text.getText().toString();
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_comment);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_comment, menu);
		return true;
	}

}
