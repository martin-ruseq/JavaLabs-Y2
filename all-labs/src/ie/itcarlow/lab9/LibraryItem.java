package ie.itcarlow.lab9;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/11/2021

public abstract class LibraryItem implements LoanItem
{
	String type;			//type of item
	String id;				//id of the item
	
	//constructor
	public LibraryItem(String type, String id)
	{
		this.type = type;
		this.id = id;
	}
	
	//getters
	public String getType()
	{
		return type;
	}
	public String getId()
	{
		return id;
	}
}
