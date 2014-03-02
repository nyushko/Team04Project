package com.example.team04project;

public class User {
	private static String username=null;
	
	
	public static void setUser(String string){
		username=string;
	}
	public static String getUser(){
		return username;
	}
	
}
