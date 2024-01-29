/*
 * This is a program that allows the user to enter the titles of movies to be stored in an array of strings and sorted so they can search for titles and view the contents of the library.
 * 
 * CSC 1350 Programming Project No 10
 * 
 * @author Hayes Chiasson
 * @since 11/17/22
 */
import java.util.Scanner;
public class Prog10_MovieLib {

//Method area
/*
 * This method validates input with both data type and range checking. It is reusable.
 * Developed: 11/17/22
 * Modified: 12/1/22
 * @author Hayes Chiasson
 * @param userPrompt: the prompt presented to the user to get an input
 * @param : lowerBound: the lower bound of the test to keep above a certain level
 * @return
 */
public static int InputValidation(String UserPrompt, int LowerBound)
{
	Scanner in = new Scanner(System.in);
	int enteredValue = 0;
	boolean validInput = false;
	
	while (! validInput)
	{
		System.out.print(UserPrompt);
		
		while (! in.hasNextInt())
		{
			System.out.println("Invalid Input - must be a whole number above " + LowerBound + ": " + in.nextLine());
			System.out.println(UserPrompt);
		}
		enteredValue = in.nextInt();
		
		if (enteredValue < LowerBound)
		{
			System.out.println("Invalid Input - must be a whole number above "+ LowerBound + ": "+ enteredValue);
		}
		else
		{
			validInput = true;
		}
	}
	return enteredValue;
}
/*
 * This method creates the array of the movie library
 * Developed: 11/17/22
 * Modified: 12/1/22
 * @author Hayes Chiasson
 * @param numberOfMovies: passes in the number of movies entered by the user / defines the length of the array
 */
public static Movie[] movieLibrary(int numberOfMovies)
{
	Movie[] movieLibrary = new Movie[numberOfMovies];
	Scanner in = new Scanner(System.in);
	String userPrompt = "";
	int lowerbound = 1905;
	for (int i = 0; i < movieLibrary.length; i++)
	{
		movieLibrary[i] = new Movie();
		System.out.println();
		System.out.println("Enter Movie Title:"); // title
		movieLibrary[i].SetTitle(in.nextLine());
		
		userPrompt = ("Enter the year that the movie was released: "); // year
		movieLibrary[i].SetYear(InputValidation(userPrompt, lowerbound));
		System.out.println(); // pretty line space
		
		userPrompt = ("Enter the movie rating: ");
		System.out.println(userPrompt);
		movieLibrary[i].SetRating(in.nextLine());
		
	}
	return movieLibrary;
}
/*
 * This method swaps the values for the sort
 * Developed: 11/17/22
 * Modified: 12/1/22
 * @author Hayes Chiasson
 * @param movieLibrary: passes in array
 * @param a: passing in value
 * param b: passing in value
 */
public static void swap(Movie[] movieLibrary, int a, int b)
{
	Movie temp = movieLibrary[a];
	movieLibrary[a] = movieLibrary[b];
	movieLibrary[b] = temp;
}
/*
 * This method bubble sorts the array
 * Developed: 11/17/22
 * Modified: 12/1/22
 * @author Hayes Chiasson
 * @param movieLibrary: inserts array into method
 */
public static void bubbleSort(Movie[] movieLibrary)
{
	boolean sorted = false;
	int i = 1;
	while (!sorted)
	{
		if (i == movieLibrary.length)
		{
			sorted = true;
		}
		else
		{
			sorted = true;
			for (int j = 0; j < movieLibrary.length - i; j++)
			{
				if (movieLibrary[j].Title().compareTo(movieLibrary[j + 1].Title()) > 0)
				{
					swap(movieLibrary, j, j + 1);
					sorted = false;
				}
			}
		}
		i++; // updates loop requirements
	}
	
}
/*
 * This method prints the array movieLibrary
 * Developed: 11/17/22
 * Modified: 12/1/22
 * @author Hayes Chiasson
 * @param movieLibrary: insterts array into method
 */
public static void arrayPrint(Movie[] movieLibrary)
{
	System.out.println("MovieLibrary:");
	for (int i = 0; i < movieLibrary.length; i++)
	{
		System.out.println("Movie Title:\t" + movieLibrary[i].Title());
	
		System.out.println("Release Year:\t" + movieLibrary[i].Year());

		System.out.println("Rating:\t\t" + movieLibrary[i].Rating());
		System.out.println();
	}
}
/*
 * This method works as a linear search for movie titles
 * Developed: 11/17/22
 * Modified: 12/1/22
 * @author Hayes Chiasson
 * @param movieLibrary: inserts array into method
 * @param searchedMovie: the user inputed value to be searched
 */
public static int userSearch(Movie[] movieLibrary, String searchedMovie)
{
	int pos = -1;
	int i = 0;
	boolean completedSearch = false;
	while (!completedSearch && i < movieLibrary.length)
	{
		if (movieLibrary[i].Title().equals(searchedMovie)) 
		{
			pos = i;
			completedSearch = true;
		}
		i++;
	}
	return pos;
}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String userPrompt = ("How many movies are in your personal library? ");
		int lowerBound = 0;
		
		
		int enteredLibrarySize = InputValidation(userPrompt, lowerBound);; // the size of the library entered by the user
		
		//class here
		Movie[] movieObjects;
		movieObjects = new Movie[enteredLibrarySize];
		movieObjects = movieLibrary(enteredLibrarySize); // = main array to that of the method
		
		
		
		
		bubbleSort(movieObjects);// sort the array by bubble sort
		
		arrayPrint(movieObjects); // prints out the array of movies
		
		System.out.println(); // Space I added to make things look prettier
		
		
		
		String searchedMovie;
		boolean wantsToQuit = false;
		while (!wantsToQuit)
		{
			System.out.println("Enter a movie title to search or Q to stop: ");
			searchedMovie = in.nextLine();
			if (searchedMovie.equals("Q"))
			{
				wantsToQuit = true;
				bubbleSort(movieObjects);// sort the array by bubble sort
				arrayPrint(movieObjects); // prints out the array of movies
				
			}
			else
			{
			int moviePosition = (userSearch(movieObjects, searchedMovie));
			if (moviePosition == -1)
			{
				System.out.println(searchedMovie + " is not a movie in the library.");
			}
			else
			{
				System.out.println(movieObjects[moviePosition].Title() + " is in the library at position "+ moviePosition + ".");
			}
			}
			
		}

	

	}
}

