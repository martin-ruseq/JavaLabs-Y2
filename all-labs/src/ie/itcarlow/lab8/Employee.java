package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			27/11/2021

public class Employee extends Person
{
	private double salery;
	
	//constructor
	public Employee(String name, double salery)
	{
		super(name);
		this.salery = salery;
	}
	
	public String getDescription()
	{
		return "An employee with salary of " + salery;
	}
}

