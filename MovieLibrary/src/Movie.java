import java.util.Scanner;
public class Movie {
	

	private String title;
	private int releaseYear; // must be > 1905
	private String rating;
	
	public void SetTitle(String Title)
	{
		title = Title;

	}
	
	public void SetYear(int Year)
	{
		releaseYear = Year;

	}
	
	public void SetRating(String Rating)
	{
		rating = Rating;
	}
	
	public String Title()
	{
		return title;
	}
	
	public int Year()
	{
		return releaseYear;
	}
	public String Rating()
	{
		return rating;
	}
}
