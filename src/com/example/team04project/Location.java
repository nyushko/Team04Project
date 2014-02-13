package com.example.team04project;



public class Location
{

	/** 
	 * @uml.property name="user"
	 * @uml.associationEnd inverse="location:com.example.team04project.User"
	 */
	private User user;

	/** 
	 * Getter of the property <tt>user</tt>
	 * @return  Returns the user.
	 * @uml.property  name="user"
	 */
	public User getUser()
	
	
	{
		return user;
	}

	/** 
	 * Setter of the property <tt>user</tt>
	 * @param user  The user to set.
	 * @uml.property  name="user"
	 */
	public void setUser(User user)
	
	
	{
		this.user = user;
	}

	/**
	 * @uml.property  name="comments"
	 * @uml.associationEnd  inverse="location:com.example.team04project.Comments"
	 */
	private Comments comments;

	/**
	 * Getter of the property <tt>comments</tt>
	 * @return  Returns the comments.
	 * @uml.property  name="comments"
	 */
	public Comments getComments()
	{

		return comments;
	}

	/**
	 * Setter of the property <tt>comments</tt>
	 * @param comments  The comments to set.
	 * @uml.property  name="comments"
	 */
	public void setComments(Comments comments)
	{

		this.comments = comments;
	}
	public void getLocation(){
		
	}

}
