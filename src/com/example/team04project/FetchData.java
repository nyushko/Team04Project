package com.example.team04project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.content.Context;

public class FetchData {
	
	protected static final String FILENAME = "filename.json";
	
	public String loadComments(Context context) {
		String json = null;
		// Reading the file and converting it to a string
		try {
			FileInputStream fis = context.openFileInput(FILENAME);
			int stream_size = fis.available();
			byte[] buffer = new byte[stream_size];
			fis.read(buffer);
			fis.close();
			//UTF-8 is the unicode format
			json = new String(buffer, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}

}
