package library;
import java.time.LocalDate;

/**
  *Publications found in Library
  *@license.agreement Gnu General Public License 3.0
  */

public class Publication
{
	private String title;
	private String author;
	private int copyright;
	private String loanedTo;
	private LocalDate dueDate;
		
	/**
	  *Forming Publication section 
	  *@param title			title of book/video
	  *@param author		name of author
	  *@param copyright		year of copyright
	  */
	
	public Publication(String title, String author, int copyright)
	{
		this.title = title;
		this.author = author;
		this.copyright = copyright;
		
		if((copyright < 1900) || (copyright > LocalDate.now().getYear()))
		{
			throw new IllegalArgumentException("ERROR: Invalid Copyright");
		}
	}
	
	/**
	  *Checking out section
	  *@param patron			name of customer/patron
	  */	
	
	public void checkout(String patron)
	{
		this.loanedTo = patron;
		this.dueDate = LocalDate.now().plusDays(14);
	}
	
	/**
	  *Forming the Resultant Strings
	  *@param bk			if it is a book
	  *@param time		    the duration of video
	  *@return				returning the string
	  */
	
	protected String toStringBldr(String bk, String time)
	{
		if(bk == "Book")
		{
			if(loanedTo != null)
			{
				return "Book: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" + "   Loaned To: " + loanedTo + "\n" + "   Due by: " + dueDate + "\n";
			}
			else
			{
				return "Book: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" ;
			}
		}
		
		else
		{
			if(loanedTo != null)
			{
				return "Video: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" + "   Runtime: " + time + " minutes" + "\n" + "   Loaned To: " + loanedTo + "\n" + "   Due by: " + dueDate + "\n";
			}
			else
			{
				return "Video: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" + "   Runtime: " + time + " minutes" + "\n" ;
			}
		}
	}
	
	@Override
	public String toString()
	{
		return toStringBldr("Book", "");
	}

}




