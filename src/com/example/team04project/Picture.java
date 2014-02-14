package com.example.team04project;

import java.util.Collection;



public class Picture
{

	/** 
	 * @uml.property name="comments"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="picture:com.example.team04project.Comments"
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

	public void takePicture(){
		
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
