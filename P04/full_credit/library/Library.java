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
	
	@Override
	
	public String toString()
	{
		return (name + "\n\n" + "0) " + publications.get(0).toString() + "\n" + "1) " + publications.get(1).toString() + "\n" + "2) " + publications.get(2).toString() + "\n" + "3) " + publications.get(3).toString() + "\n") ;
	}
	
}


