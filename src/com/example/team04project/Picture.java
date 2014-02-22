package com.example.team04project;

import java.util.Collection;

import android.content.Intent;
import android.provider.MediaStore;
import android.widget.Toast;



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
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(intent, 0);
		
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {
	        if (resultCode == RESULT_OK) {
	            // Image captured and saved to fileUri specified in the Intent
	            Toast.makeText(this, "Image saved to:\n" +
	                     data.getData(), Toast.LENGTH_LONG).show();
	        } else if (resultCode == RESULT_CANCELED) {
	            // User cancelled the image capture
	        } else {
	            // Image capture failed, advise user
	        }
	    }
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
