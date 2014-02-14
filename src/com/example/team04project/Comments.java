package com.example.team04project;

import java.util.Collection;



public class Comments
{

	/** 
	 * @uml.property name="picture"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="comments:com.example.team04project.Picture"
	 */
	private Collection<Picture> picture;

	/** 
	 * Getter of the property <tt>picture</tt>
	 * @return  Returns the picture.
	 * @uml.property  name="picture"
	 */
	public Collection<Picture> getPicture()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	{
		return picture;
	}

	/** 
	 * @uml.property name="date"
	 * @uml.associationEnd aggregation="shared" inverse="comments:com.example.team04project.Date"
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
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="comments:com.example.team04project.Location"
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
	 * @uml.property name="favourites"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="comments:com.example.team04project.Favourites"
	 */
	private Collection<Favourites> favourites;

	/** 
	 * Getter of the property <tt>favourites</tt>
	 * @return  Returns the favourites.
	 * @uml.property  name="favourites"
	 */
	public Collection<Favourites> getFavourites()
	
	
	
	
	
	
	
	{
		return favourites;
	}

	public void sort(){
	
	}
	public void  sortByProximaty(){
		
	}
	public void attachPicture(){
		
	}
	public void sortByDate(){
		
	}
	public void cacheComments(){
		
	}
	public void shareComments(){
		
	}
	public void changeGeoLocation(){
	}
	public void edit(){
		
	}
	public void sortByPicture(){
		
	}
	/** 
	 * @uml.property name="user"
	 * @uml.associationEnd inverse="comments:com.example.team04project.User"
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
	 * Setter of the property <tt>favourites</tt>
	 * @param favourites  The favourites to set.
	 * @uml.property  name="favourites"
	 */
	public void setFavourites(Collection<Favourites> favourites)
	
	
	
	
	
	{
	
		this.favourites = favourites;
	}

	/** 
	 * Setter of the property <tt>picture</tt>
	 * @param picture  The picture to set.
	 * @uml.property  name="picture"
	 */
	public void setPicture(Collection<Picture> picture)
	
	
	
	
	{
	
		this.picture = picture;
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
}
