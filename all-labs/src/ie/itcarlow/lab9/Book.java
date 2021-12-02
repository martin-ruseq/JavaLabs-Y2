package ie.itcarlow.lab9;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/11/2021

public class Book extends LibraryItem implements LoanItem
{
	String author;		//hold name of book author
	String title;		//hold book title
	int numPages;		//hold number of pages in the book
	
	//constructor
	public Book(String type, String id, String author, String title, int numPages)
	{
		super(type, id);			//invoke immediate parent class constructor
		this.author = author;
		this.title = title;
		this.numPages = numPages;
	}
	
	//getters
	public String getAuthor()
	{
		return author;
	}
	public String getTitle()
	{
		return title;
	}
	public int getNumPages()
	{
		return numPages;
	}
	
	//interface method
	public double calculatePrice()
	{
		return 35.00;
	}

	//tostring method
	public String toString()
	{
		return "Book Author: " + author + "\nBook title: " + title + "\nPages: " + numPages + "\nItem Type: " + type
				+ "\nID: " + id + "\n";
	}
}	
