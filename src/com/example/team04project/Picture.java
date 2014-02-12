package com.example.team04project;



public class Picture
{

	/** 
	 * @uml.property name="comments"
	 * @uml.associationEnd inverse="picture:com.example.team04project.Comments"
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
	public void takePicture(){
		
	}
}
