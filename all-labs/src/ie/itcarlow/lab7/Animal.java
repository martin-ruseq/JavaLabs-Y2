package ie.itcarlow.lab7;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			24/11/2021

public class Animal
{
	protected String name;
	private int age;
	private char sex;
	
	//constructor
	public Animal (String name, int age, char sex)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//misc methods
	public void eat()
	{
		System.out.println(name + " is eating...");
	}
	public void sleep()
	{
		System.out.println(name + " is sleeping...");
	}
	public void makeSound()
	{
		System.out.println(name + " is making sound...");
	}
	
	//toString Metod
	public String toString()
	{
		return "name: " + name +", age: " + age + ", sex: " + sex;
	}
	
}
