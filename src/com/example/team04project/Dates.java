package com.example.team04project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.annotation.SuppressLint;

public class Dates {
	@SuppressLint("SimpleDateFormat")
	public static String getDate(){
		Calendar date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy-HH:mm");
		String strDate = sdf.format(date.getTime());
		//Returns a string of date
		return strDate;
	}
}
