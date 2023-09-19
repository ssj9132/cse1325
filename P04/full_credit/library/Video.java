package library;

import java.time.Duration;

public class Video extends Publication
{
	private Duration time;
	
	/**
	  *Make a video with it's title, author, copyright year and runtime
	  *@param title 		title of video
	  *@param author		writer of video
	  *@param copyright		year of copyright for video
	  *@param runtime		runtime of video in minutes
	  */
	 
	 public Video(String title, String author, int copyright, int time)
	 {
	 	super(title, author, copyright);
	 	
	 	if(time <= 0)
	 	{
	 		throw new InvalidRuntimeException(title,time);
	 	}
	 	else
	 	{
	 		this.time = Duration.ofminutes(time);
	 	}
	 }
	

	 
	 @Override
	 public String toString()
	 {
	 	int rtime = (int)(time.getSeconds()/60);
	 	return toStringBldr("Video", Integer.toString(rtime));
	 	
	 }
	 
}
