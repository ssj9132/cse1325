package library;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
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

	public void save(BufferedWriter bw) throws IOException
	{
		bw.write(name + '\n');
		bw.write(""+ publications.size() + '\n');

		
		for(Publication publication : publications)
		{
			bw.write((publication instanceof Video) ? "video\n" : "publication\n");
			publication.save(bw);
		}
	}
	
	public Library(BufferedReader br) throws IOException
	{
		System.out.println("1");
		this.name = br.readLine();
		this.publications = new ArrayList<>();
		System.out.println("2");
		int size = Integer.parseInt(br.readLine());
		System.out.println("3");
	 	for(int i = 0; i < size; i++)
	 	{
	 		System.out.println("4");
	 		String j = br.readLine();
	 		System.out.println("5");
	 		if(j.equals("video"))
	 		{
	 			System.out.println("6");
	 			Video video = new Video(br);
	 			System.out.println("7");
	 			publications.add(video);
	 			System.out.println("8");
	 		}
	 		else
	 		{
	 			System.out.println("9");
	 			Publication publication = new Publication(br);
	 			System.out.println("10");
	 			publications.add(publication);
	 			System.out.println("11");
	 		}
	 	}
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
	
	/**
	  *Checking in book/video 
	  *@param publicationIndex		item number/index number
	  */
	  	
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


