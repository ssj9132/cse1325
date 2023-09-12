import java.util.ArrayList;


public class Library
{
	private String name;
	private ArrayList<Publication> publications;

	public Library(String name)
	{
	this.name = name;
	this.publications = new ArrayList<>();
	}
	
	public void addPublication(Publication publication)
	{
		publications.add(publication);
	}
	
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
		return (name + "\n\n" + "0) " + publications.get(0).toString() + "\n" + "1) " + publications.get(1).toString() + "\n" + "2) " + publications.get(2).toString() + "\n") ;
	}
	
}


