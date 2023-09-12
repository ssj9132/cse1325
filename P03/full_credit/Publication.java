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
	
	@Override
	
	public String toString()
	{
		
		if(loanedTo != null)
		{
			return "Title: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" + "   Loaned To: " + loanedTo + "\n" + "   Due by: " + dueDate + "\n";
		}
		else
		{
		return "Title: "+ title + "\n" + "   Author: " + author + "\n" + "   Copyright Year: " + copyright + "\n" ;
		}
	}

}




