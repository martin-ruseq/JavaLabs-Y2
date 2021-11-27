package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			27/11/2021

public abstract class Person
{
	private String name;
	
	//constructor 
	public Person(String name)
	{
		this.name = name;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	
	//abstract method
	public abstract String getDescription();
}
