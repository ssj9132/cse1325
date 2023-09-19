package library;
import java.time.LocalDate;

public class Publication
{
	private String title;
	private String author;
	private int copyright;
	private String loanedTo;
	private LocalDate dueDate;
	
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
	
	public void checkout(String patron)
	{
		this.loanedTo = patron;
		this.dueDate = LocalDate.now().plusDays(14);
	}
	
	protected String toStringBldr(String pre, String time)
	{
		if(pre == "Book")
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
				return "Video: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" + "Runtime: " + time + "\n" + "   Loaned To: " + loanedTo + "\n" + "   Due by: " + dueDate + "\n";
			}
			else
			{
				return "Video: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" + "Runtime: " + time + "\n" ;
			}
		}
	}
	
	@Override
	public String toString()
	{
		return toString("Book", "");
	}

}




