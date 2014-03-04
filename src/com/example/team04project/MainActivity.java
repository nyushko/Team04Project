package com.example.team04project;


import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends Activity{
	//An list that holds all the comments made by all users
	ArrayList<Comments> browseComment = new ArrayList<Comments>();
	
	public void createView(){
		LinearLayout ll = (LinearLayout)findViewById(R.id.browseComment);
		ll.removeAllViews();
		for (Comments c: browseComment){
			TextView comments= new TextView(this);
			comments.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
			comments.setText(c.format());
			ll.addView(comments);
			ElasticSearch.pushComment(c,c.getId());
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		browseComment.add(new Comments("Hello Tarek","Nov 2- 1003","telbohtimy","2"));
		browseComment.add(new Comments("Hello Monkey","Nov 2- 2003","telbohtim","3"));
		browseComment.add(new Comments("Hello OtherMonkey","Nov 2- 1993","telboht","100"));
		createView();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		getMenuInflater().inflate(R.menu.create_menu, menu);
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}
	/*
	 Selects on option that will take you to the appropriate view
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
        	case R.id.createComment:
        		Intent intent = new Intent(MainActivity.this, CreateCommentView.class);
        		startActivityForResult(intent,0);
        		//Intent intent = new Intent(this,CreateCommentView.class);
        		//startActivity(intent);
        		break;
        	case R.id.options:
        		Intent intent1 = new Intent(this,OptionsView.class);
        		startActivity(intent1);
        		break;
        	default:
        		return super.onOptionsItemSelected(item);
        	}
			return true;
		}
	@Override
	/*
	 Gets a json string from the CreateCommentView.class and turns it back to a class of comments then the comment class is 
	 added to the ArrayList of Comments and properly formatted for viewing.
	 */
	public void onActivityResult(int requestCode,int resultCode, Intent data){	
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == RESULT_OK){
		
			//Turn the json string into a class 
			Gson gson = new Gson();
			String json=data.getExtras().getString("Class");
			Comments newComment = gson.fromJson(json, Comments.class);
			browseComment.add(0, newComment);
			createView();
		
			
			//ElasticSearch.pushComment(browseComment);
			//ElasticSearch.pushComment(new Comments("Hello Tarek","Nov 2- 1003","telbohtimy"));
			//ElasticSearch.pushComment(new Comments("Hello Monkey","Nov 2- 2003","telbohtim"));
			//ElasticSearch.pushComment(new Comments("Hello OtherMonkey","Nov 2- 1993","telboht"));
			ElasticSearch.pushComment(newComment,newComment.getId());
		}
	}
	
}
