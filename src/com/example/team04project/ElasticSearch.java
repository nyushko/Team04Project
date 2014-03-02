package com.example.team04project;



import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

import com.google.gson.Gson;

public class ElasticSearch {
	public static final String SERVER_URL = "http://cmput301.softwareprocess.es:8080/cmput301w14t04/TestArea/1";
	public static final String LOG_TAG = "ElasticSearch";


	public static void pushComment(final Comments comment) {
		final Gson GSON = new Gson();
		Thread thread = new Thread() {

			@Override
			public void run() {
				HttpClient client = new DefaultHttpClient();
				HttpPost request = new HttpPost(SERVER_URL);

				try {
					request.setEntity(new StringEntity(GSON.toJson(comment)));
				}
				catch (UnsupportedEncodingException exception) {
					Log.w(LOG_TAG, "Error encoding Comments: " + exception.getMessage());
					return;
				}

				HttpResponse response;
				try {
					response = client.execute(request);
					Log.i(LOG_TAG, "Response: " + response.getStatusLine().toString());
				} 
				catch (IOException exception) {
					Log.w(LOG_TAG, "Error sending Comments: " + exception.getMessage());
				}
			}
		};

		thread.start();
	}
}


