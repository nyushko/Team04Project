package com.example.team04project;
/*This a comments class which holds all the information about comments such as the user the 
 * date the comment was made and the location it was made at
 */
public class Comments {
	public String comment;
	public String date;
	public String user;
	
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	public String getCommentDate(){
		return date;
	}
	public void setCommentDate(String date){
		this.date = date;
	}
	
	
	public String getCommentUser(){
		return user;
	}
	public void setCommentUser(String user){
		this.user = user;
	}
	
	
	public Comments(String comment, String date, String user) {
		super();
		this.comment = comment;
		this.date = date;
		this.user = user;
	}
}