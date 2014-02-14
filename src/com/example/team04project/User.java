package com.example.team04project;

import java.util.Collection;



public class User
{

	/** 
	 * @uml.property name="date"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="user:com.example.team04project.Date"
	 */
	private Collection<Date> date;

	/** 
	 * Getter of the property <tt>date</tt>
	 * @return  Returns the date.
	 * @uml.property  name="date"
	 */
	public Collection<Date> getDate()
	
	
	
	
	
	
	
	
	{
		return date;
	}

	/** 
	 * @uml.property name="location"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="user:com.example.team04project.Location"
	 */
	private Collection<Location> location;

	/** 
	 * Getter of the property <tt>location</tt>
	 * @return  Returns the location.
	 * @uml.property  name="location"
	 */
	public Collection<Location> getLocation()
	
	
	
	
	
	
	
	{
		return location;
	}

	/** 
	 * @uml.property name="comments"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="user:com.example.team04project.Comments"
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

	public void browse(){
		
	}

	/** 
	 * Setter of the property <tt>location</tt>
	 * @param location  The location to set.
	 * @uml.property  name="location"
	 */
	public void setLocation(Collection<Location> location)
	
	
	
	
	{
		this.location = location;
	}

	/** 
	 * Setter of the property <tt>date</tt>
	 * @param date  The date to set.
	 * @uml.property  name="date"
	 */
	public void setDate(Collection<Date> date)
	
	
	{
		this.date = date;
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
