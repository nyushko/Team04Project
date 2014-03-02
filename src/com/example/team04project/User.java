package com.example.team04project;

/*
 * This class has information about the username 
 * and sets and gets the username when asked to
 */
public class User {
	private static String username=null;
	
	
	public static void setUser(String string){
		username=string;
	}
	public static String getUser(){
		return username;
	}
	
}
