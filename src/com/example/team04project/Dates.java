package com.example.team04project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.annotation.SuppressLint;

/*
 * This class gets the current date from the system
 * and returns it as a string when asked by the program
 */
public class Dates {
	@SuppressLint("SimpleDateFormat")
	public static String getDate(){
		Calendar date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy-HH:mm");
		String strDate = sdf.format(date.getTime());
		return strDate;
	}
}
