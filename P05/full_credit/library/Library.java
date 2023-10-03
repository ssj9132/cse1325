package library;
import java.util.ArrayList;

/**
  *Library for checking out books and videos
  *@license.agreement Gnu General Public License 3.0
  */
  
public class Library
{
	private String name;
	private ArrayList<Publication> publications;

	/**
	  *Library containg books and videos formed
	  *@param name		name of Library
	  */
	  
	public Library(String name)
	{
	this.name = name;
	this.publications = new ArrayList<>();
	}
	
	/**
	  *Adding publication of book/video
	  *@param publication		item
	  */
	public void addPublication(Publication publication)
	{
		publications.add(publication);
	}
	
	/**
	  *Checking out book/video 
	  *@param publicationIndex		item number/index number
	  *@param patron				customer/patron name
	  */
	public void checkout(int publicationIndex, String patron)
	{
		if(publicationIndex >= 0 && publicationIndex < publications.size())
		{
			Publication publication = publications.get(publicationIndex);
			publication.checkout(patron);
		}
		
		else
		{
			throw new IndexOutOfBoundsException("ERROR: Invalid Index");
		}
		
	}
	
	public void checkin(int publicationIndex)
	{
		if(publicationIndex >= 0 && publicationIndex < publications.size())
		{
			Publication publication = publications.get(publicationIndex);
			publication.checkin();
		}
		
		else
		{
			throw new IndexOutOfBoundsException("ERROR: Invalid Index");
		}
		
	}
	
	@Override
	
	public String toString()
	{	
		String return_string = name + "\n\n";
		for (int i = 0; i < publications.size(); i++)
		{
			return_string = return_string + i+") " + publications.get(i).toString() + "\n";
		}
		return return_string;
	}
	
}


