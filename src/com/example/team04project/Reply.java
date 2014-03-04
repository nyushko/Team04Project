package com.example.team04project;
import java.util.Collection;

import org.w3c.dom.Comment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

//so far, only to edit a comment



public class Reply extends Comments
{

	public Reply(String comment, String date, String user) {
		super(comment, date, user);
		// TODO Auto-generated constructor stub
	}

	public Comment comment;
	//Returns the comment
	
	public Comment getComment() {
		return comment;
	}
	
	public void setComment (Comment comment) {
		this.comment = comment;
	}
	
	private Comment commentToEdit;
	
	//Returns the comment to edit
	public Comment getCommentToEdit() {
	}
	
	public void setCommentToEdit(Comment commentToEdit) {
		this.commentToEdit = commentToEdit;
	}
	
	public void PostComment(Comment comment) {
	}
	
	private CommentController commentController;
	
	public CommentController getCommentController() {
		return commentController;
	}
	
	public void setCommentController (CommentController commentController) {
		this.commentController = commentController;
	}
	
	private UserController userController;
	
	public UserController getUserController() {
		return userController;
	}
	
	public void setUserController(UserController userController) {
		this.userController = userController;
	}
	
	public class BrowseRelply extends BrowseComment {
		String saveFile = "replies.json";
		protected boolean onCreateOptionsMenu(Menu menu) {
			getMenuInflater().inflate(R.menu.browse_reply, menu);
			return true;
		}
	}
	
}

	
	
	/**
	 * public Reply(String comment, String date, String user)
	 
	{

		super(comment, date, user);
		// TODO Auto-generated constructor stub
	}

	public void addReply(){
		
	}
	**/

