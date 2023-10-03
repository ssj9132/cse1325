package mdi;
import library.*;
import java.util.Scanner;


public class LibraryManager
{
	Library new_library = new Library("UTA Central Library") ;
	public LibraryManager(Library new_library)
	{
		this.new_library = new_library;
	}
	
	public void ListBookVideo()
	{
		System.out.println(new_library);
	}
	public void AddBook()
		{
			try
			{
				Scanner n = new Scanner(System.in);
				System.out.print("Name of the book: ");
				String book_name = n.nextLine();
				System.out.print("Name of author: ");
				String book_author = n.nextLine();
				System.out.print("Year of copyright: ");
				int book_yr = n.nextInt();
				n.nextLine();
				new_library.addPublication(new Publication(book_name,book_author,book_yr));
			}
			
			catch(Exception e)
			{
				System.err.println("Invalid format"+e);
			}
		}
		
		public void AddVideo()
		{
			try
			{
				Scanner v = new Scanner(System.in);
				System.out.print("Name of the video: ");
				String video_name = v.nextLine();
				System.out.print("Name of video author: ");
				String video_author = v.nextLine();
				System.out.print("Year of copyright: ");
				int video_yr = v.nextInt();
				v.nextLine();
				System.out.print("Runtime: ");
				int rt = v.nextInt();
				v.nextLine();

			    new_library.addPublication(new Video(video_name,video_author,video_yr,rt));
			}
			catch(Exception e)
			{
				System.err.println("Invalid format"+e);
			}
		}
		
		public void check_out()
		{
			System.out.println(new_library);
			Scanner in = new Scanner(System.in);
			System.out.print("Which book/video to checkout? ");
			int publicationIndex = in.nextInt();
			in.nextLine();
			System.out.print("Who are you? ");
			String name = in.nextLine();
			try 
			{
				new_library.checkout(publicationIndex, name);
			}
			catch(Exception e)
			{
				System.err.println(e.getMessage());
			}
		}
		public void check_in()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Which book/video to checkin? ");
			int publicationIndex = in.nextInt();
			in.nextLine();
			try 
			{
				new_library.checkin(publicationIndex);
			}
			catch(Exception e)
			{
				System.err.println(e.getMessage());
			}
		}
	
		
	public static void main(String[] args)
	{
		Library new_library = new Library("UTA Central Library");
		LibraryManager menu = new LibraryManager(new_library);
		
		while(true)
		{
			try
			{
				System.out.println("\n=========\n"+"Main Menu\n"+"=========\n");
				System.out.println("\nUTA Central Library\n");
				System.out.println("0) Exit");
				System.out.println("1) List");
				System.out.println("2) Add Book");
				System.out.println("3) Add Video");
				System.out.println("4) Check out");
				System.out.println("5) Check in");
				String s = System.console().readLine("\nSelection: ");
				if(s.charAt(0) == '0')
				{
					break;
				}
				int selection = Integer.parseInt(s);
				if(selection == 1)
				{
					menu.ListBookVideo();
				}
				
				else if(selection == 2)
				{
					menu.AddBook();
				}
				
				else if(selection == 3)
				{
					menu.AddVideo();
				}
				else if(selection == 4)
				{
					menu.check_out();
				}
				else if(selection == 5)
				{
					menu.check_in();
				}
	

				else 
				{
					throw new IllegalArgumentException(s + "- select between 0 and 5");
				}
			}
			
			catch(Exception e)
			{
				System.err.println("Invalid selection: " + e);
			
			}
	
		

	}
	}
}

