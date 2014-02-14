package com.example.team04project;

import java.util.Collection;



public class Date
{

	/** 
	 * @uml.property name="user"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="date:com.example.team04project.User"
	 */
	private Collection<User> user;

	/** 
	 * Getter of the property <tt>user</tt>
	 * @return  Returns the user.
	 * @uml.property  name="user"
	 */
	public Collection<User> getUser()
	
	
	
	
	
	
	{
		return user;
	}

	/** 
	 * @uml.property name="comments"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="date:com.example.team04project.Comments"
	 */
	private Collection<Comments> comments;

	/** 
	 * Getter of the property <tt>comments</tt>
	 * @return  Returns the comments.
	 * @uml.property  name="comments"
	 */
	public Collection<Comments> getComments()
	
	
	
	
	
	{
		return comments;
	}

	public void getDate(){
		
	}

	/** 
	 * Setter of the property <tt>user</tt>
	 * @param user  The user to set.
	 * @uml.property  name="user"
	 */
	public void setUser(Collection<User> user)
	
	{
	
		this.user = user;
	}

	/** 
	 * Setter of the property <tt>comments</tt>
	 * @param comments  The comments to set.
	 * @uml.property  name="comments"
	 */
	public void setComments(Collection<Comments> comments)
	{

		this.comments = comments;
	}
}
