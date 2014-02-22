package com.example.team04project;

import java.util.Collection;



public class Comments
{

	public String comment;
	public Date date;
	public User user;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCommentDate()
	{
		return date;
	}
	public void setCommentDate(Date date)
	{
		this.date = date;
	}
	public User getCommentUser()
	{
		return user;
	}
	public void setCommentUser(User user)
	{
		this.user = user;
	}

	
	
	
	
	private Collection<Picture> picture;

	
	public Collection<Picture> getPicture()
	{
		return picture;
	}



	private Collection<Location> location;

	
	public Collection<Location> getLocation()
	{
		return location;
	}

	private Collection<Favourites> favourites;

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
	
	public void setFavourites(Collection<Favourites> favourites)
	{
		this.favourites = favourites;
	}

	
	public void setPicture(Collection<Picture> picture)
	{
		this.picture = picture;
	}

	
	public void setLocation(Collection<Location> location)
	{
		this.location = location;
	}
}
