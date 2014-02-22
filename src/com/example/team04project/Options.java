package com.example.team04project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Options extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
		String username = null;
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
