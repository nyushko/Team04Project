


import java.io.IOException;
import java.io.UnsupportedEncodingException;
	
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

import com.example.team04project.Comments;
import com.google.gson.Gson;

public class ElasticSearch {
	public static void pushComment(final Comments comment){
		final Gson gson = new Gson();
		Thread thread = new Thread(){
			@Override
			public void run() {
				HttpClient client = new DefaultHttpClient();
				HttpPost request = new HttpPost("http://cmput301.softwareprocess.es:8080/cmput301w14t04/TestArea");
				final String LOG_TAG = "ElasticSearch";
				try {
					request.setEntity(new StringEntity(gson.toJson(comment)));
				}catch (UnsupportedEncodingException exception) {
					Log.w(LOG_TAG, "Error encoding Comment: " + exception.getMessage());
					return;
				}
				
				HttpResponse response;
				try {
					response = client.execute(request);
					Log.i(LOG_TAG, "Response: " + response.getStatusLine().toString());
				} catch (IOException exception) {
						Log.w(LOG_TAG, "Error sending Comment: " + exception.getMessage());
				}
			}
		};
		thread.start();
	}
}


