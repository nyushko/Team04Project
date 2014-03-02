package com.example.team04project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import com.example.team04project.User;

public class CreateCommentView extends Activity {
	private static String saveFile = "username.sav";
	/*
	 Gets the user name from internal storage
	 then retrieves it and sets the username for the username class
	 */
	public void loadUser(){
		try{
			FileInputStream fis;
			fis = openFileInput(saveFile);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			User.setUser(in.readLine());
			fis.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	 public void postComment(View view){
  		//Gets the date,user and other things from their classes and changes them to strings and makes a new comment

  		EditText text = (EditText) findViewById(R.id.comment);
  		String commentText = text.getText().toString();
  		String currDate = Dates.getDate();
  		loadUser();
  		
  		
  		/*
  		 * If no user name is set then the program tells the user
  		 * that they need a user name to make a comment otherwise
  		 * it will make the comment then turn it into a json string and
  		 * send it through an intent back to the mainactivity.java
  		 */
  		if (User.getUser()==null){
			Toast.makeText(CreateCommentView.this, "You need to make a username to post comments", Toast.LENGTH_SHORT).show();
			finish();
  		}
  		else{
  			String theUser=User.getUser();
  			Comments newComment = new Comments (commentText,currDate,theUser );
  			
  			Gson gson = new Gson();
  	  		Intent intent = new Intent();
  	  		String json= gson.toJson(newComment);
  	  		intent.putExtra("Class", json);
  	  		setResult(RESULT_OK, intent);
  	  		finish();
  		}
  	}
	 
	 
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_comment_view);
      
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_comment_view, menu);
        return true;
    }
    
}