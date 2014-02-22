package com.example.team04project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Options extends Activity {
	public String saveFile="username.txt";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
		String username = null;
		//If I save the user class to memory then i don't have to read this file and can remove this code
		//This reads a file from internal storage to see if a user name already exists
		try {
			FileInputStream fis = openFileInput(saveFile);//Not sure what it is complaining
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String aline = in.readLine();
			username=aline;
			fis.close();
			}
		catch (FileNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
		} 
		catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
		}
		TextView usernameView = new TextView(this);
		Button btnUser = new Button(this);
		LinearLayout ll = (LinearLayout)findViewById(R.id.optionId);
		usernameView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
		btnUser.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
		if(username==null){
			usernameView.setText("You have not made a username");
			btnUser.setText("Create Username");
			//TO DO create a check to make sure that the username is not taken by another user
		}
		else{
			usernameView.setText("Your username is:\n"+username);
			btnUser.setText("Change Username");
			//TO DO create a check to make sure that the username is not taken by another user
		}
		ll.addView(usernameView);
		ll.addView(btnUser);
		//TO DO create on click for the button and save the user name
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options, menu);
		return true;
	}

}
