package library;
import java.time.LocalDate;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

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
	
	public Publication(BufferedReader br) throws IOException
	{
		System.out.println("p1");
		this.title     = br.readLine();
		System.out.println("a");
		this.author    = br.readLine();
		System.out.println("b");
		this.copyright = Integer.parseInt(br.readLine());
		System.out.println("2");
		
		String m = br.readLine(); 
		System.out.println("#"+m+"#");
		System.out.println("3");
		
		if(m.equals("checked in"))
		{
			System.out.println("4");
			loanedTo = null;
			dueDate = null;
		}
		else
		{
			System.out.println("p5");
			loanedTo = br.readLine();
			System.out.println("p6");
			String duedate = br.readLine();
			System.out.println("p7");
			System.out.println(duedate);
			dueDate = LocalDate.parse(duedate);
			System.out.println("p8");
		}
	}
	public void save(BufferedWriter bw) throws IOException
	{
		bw.write("" + title     + '\n');
		bw.write("" + author    + '\n');
		bw.write("" + copyright + '\n');
		
		if(loanedTo == null)
		{
			bw.write("checked in\n");
		}
		else
		{
			bw.write("checked out\n");
			bw.write(loanedTo + '\n');
			bw.write(dueDate.toString()+ '\n');
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
	  *Checking in section
	  */	
	  
	public void checkin()
	{
        loanedTo = null;
        dueDate = null;
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




