package ie.itcarlow.lab9;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			30/11/2021

public class Lab9Q1
{
	public static void main(String[] args)
	{
		LibraryItem[] items = new LibraryItem[2];		//array of LibraryItem 
		
		//input
		Book book1 = new Book("Book", "1000", "Horstmann", "Core Java Fundamentals", 889);		//create new Book object
		CD cd1 = new CD("CD", "1001", "Queen", "Queen", 10);									//create new CD object
		
		items[0] = book1;		//insert book object into array at index zero 
		items[1] = cd1;			//insetr cd object into array at index one
		
		//output
		for(int i = 0; i < items.length - 1; i++)
		{
			System.out.println(book1.toString() + "Book price: " + items[i].calculatePrice() + "\n");
			System.out.println(cd1.toString() + "CD price: " + items[i].calculatePrice());
		}

	}
}
