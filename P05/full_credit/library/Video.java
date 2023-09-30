package library;
import java.time.Duration;

/**
  *Video from library for checking out
  *@license.agreement Gnu General Public License 3.0
  */

public class Video extends Publication
{
	private Duration time;
	
	/**
	  *Make a video with it's title, author, copyright year and runtime
	  *@param title 		title of video
	  *@param author		writer of video
	  *@param copyright		year of copyright for video
	  *@param time			runtime of video in minutes
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
	 		this.time = Duration.ofMinutes(time);
	 	}
	 }

 
	 @Override
	 public String toString()
	 {
	 	int rtime = (int)(time.getSeconds()/60);
	 	return toStringBldr("Video", Integer.toString(rtime));
	 }
	 
}
