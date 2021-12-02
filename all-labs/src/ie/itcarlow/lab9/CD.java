package ie.itcarlow.lab9;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/11/2021

public class CD extends LibraryItem implements LoanItem
{
	String band;
	String title;
	int numTracks;
	
	//constructor
	public CD(String type, String id, String band, String title, int numTracks)
	{
		super(type, id);		//invoke immediate parent class constructor
		this.band = band;
		this.title = title;
		this.numTracks = numTracks;
	}
	
	//getters
	public String getBand()
	{
		return band;
	}
	public String getTitle()
	{
		return title;
	}
	public int getNumTracks()
	{
		return numTracks;
	}

	//interface method
	public double calculatePrice()
	{
		return 55.00;
	}
	
	//tostring method
	public String toString()
	{
		return "Band name: " + band + "\nCD Title: " + title + "\nNumber of Tracks: " + numTracks + "\nItem Type: " + type
				+ "\nID: " + id + "\n";
	}
}
