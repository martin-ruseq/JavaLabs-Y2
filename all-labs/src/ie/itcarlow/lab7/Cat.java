package ie.itcarlow.lab7;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			24/11/2021

public class Cat extends Animal
{
	public Cat(String name, int age, char sex)
		{
			super(name, age, sex);
		}
		
	public void makeSound()
		{
			System.out.println(name + " is making meaw...");
		}
}
