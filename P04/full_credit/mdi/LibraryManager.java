package mdi;
import library.*;
import java.util.Scanner;

public class LibraryManager
{
	public static void main(String[] args)
	{
		Library new_library = new Library("UTA Central Library");
		
		new_library.addPublication(new Publication("Atomic Habits", "James Clear", 2018));
		new_library.addPublication(new Publication("2 States", "Chetan Bhagat", 2009));
		new_library.addPublication(new Publication("The Alchemist", "Paulo Coelho", 1988));
		new_library.addPublication(new Video("Oppenheimer","Christopher Nolan", 2023, 230 ));
		
		System.out.println(new_library);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Which book to checkout? ");
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
		
		System.out.println(new_library);
	}
}

