package com.example.team04project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CreateComment extends Activity {
	public void postComment(View view){
		//Gets the date,user and other things from their classes and changes them to strings and makes a new comment
		Dates date = new Dates();
		User user = new User();
		//Get the other parameters too
		EditText text = (EditText) findViewById(R.id.comment);
		String commentText = text.getText().toString();
		String currDate = date.getDate();
		String theUser=user.getUser();
		//Intialize the comments class
		Comments newComment = new Comments (commentText,currDate,theUser );
		
		//I want to send the class through an intent but not quite sure how to do that yet
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
