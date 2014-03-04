package com.example.team04project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;

public class SortByDate {

	// A JSON array is already sorted by the time it was added (the date)
	// First post is at the front of the array, the latest post is at the back
	// of the array
	// So here, only need to print out what is in the array in reverse order

	// Open the file where the JSON information is stored
	// Save data as a .json extention (will save a few lines of code in the future)
	protected static final String FILENAME = "filename.json";

	protected String loadFromFile(Context context) {
		// Log.d("loadFromFile", "loadFromFile");
		ArrayList<String> count_name = new ArrayList<String>();
		try {
			FileInputStream fis = context.openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String line = in.readLine();
			while (line != null) {
				count_name.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count_name.toString();

	}
	
	//MUST BE TESTED
	/* protected String[] loadResultsFile(Context context) {
		ArrayList<String> count_name = new ArrayList<String>();
		try {
			FileInputStream fis = context.openFileInput(FILENAME_FULL);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String line = in.readLine();
			while (line != null) {
				count_name.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count_name.toArray(new String[count_name.size()]);
	}
	*/

	protected void Test() {
		try {
			// Null for now, will have to change to context that will be from the main activity
			String comments_file = loadFromFile(null);
			JSONArray json_array = new JSONArray(comments_file);
			// Assume that date does not change when editing comment
			// So don't have to sort for now
			for (int i = 0; i < json_array.length(); i++) {
				
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
