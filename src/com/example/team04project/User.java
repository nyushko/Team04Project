package com.example.team04project;



public class User
{

	/**
	 * @uml.property  name="date"
	 * @uml.associationEnd  aggregation="shared" inverse="user:com.example.team04project.Date"
	 */
	private Date date;

	/**
	 * Getter of the property <tt>date</tt>
	 * @return  Returns the date.
	 * @uml.property  name="date"
	 */
	public Date getDate()
	
	
	
	{
	
		return date;
	}

	/**
	 * Setter of the property <tt>date</tt>
	 * @param date  The date to set.
	 * @uml.property  name="date"
	 */
	public void setDate(Date date)
	
	
	
	{
	
		this.date = date;
	}

	/** 
	 * @uml.property name="location"
	 * @uml.associationEnd aggregation="shared" inverse="user:com.example.team04project.Location"
	 */
	private Location location;

	/** 
	 * Getter of the property <tt>location</tt>
	 * @return  Returns the location.
	 * @uml.property  name="location"
	 */
	public Location getLocation()
	
	
	{
		return location;
	}

	/** 
	 * Setter of the property <tt>location</tt>
	 * @param location  The location to set.
	 * @uml.property  name="location"
	 */
	public void setLocation(Location location)
	
	
	{
		this.location = location;
	}

	/**
	 * @uml.property  name="comments"
	 * @uml.associationEnd  aggregation="shared" inverse="user:com.example.team04project.Comments"
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
	public void browse(){
		
	}
}
