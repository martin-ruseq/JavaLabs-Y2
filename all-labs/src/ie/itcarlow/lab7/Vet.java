package ie.itcarlow.lab7;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			24/11/2021

public class Vet
{
	protected String name;
	
	//constructor
	public Vet(String name)
	{
		this.name = name;
	}
	
	//misc method
	public void vaccinate(Animal animal)
	{
		System.out.println(name + " is vaccinating");
		
		if(animal instanceof Dog)
		{
			System.out.println("Dog has beed vaccinated, " + "[ " + animal + " ]");
		}
		else if(animal instanceof Cat)
		{
			System.out.println("Cat has been vaccinated, " + "[ " + animal + " ]");
		}
		else
		{
			System.out.println("The vet is vaccinating dogs and cats only!");
		}
	}
}
