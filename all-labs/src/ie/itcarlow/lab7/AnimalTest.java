package ie.itcarlow.lab7;

//Student Name:		Marcin Rusiecki
//Student ID:		C00263263
//Date:				24/11/2021

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dogJerry = new Dog("Jerry", 5, 'F');
		System.out.println(dogJerry);
		dogJerry.eat();
		dogJerry.sleep();
		dogJerry.makeSound();
		
		System.out.println();
		
		Animal catTom = new Cat("Tom", 3, 'M');
		System.out.println(catTom);
		catTom.eat();
		catTom.sleep();
		catTom.makeSound();
		
		System.out.println();
		
		Vet vet = new Vet("Happy Animal");
		vet.vaccinate(dogJerry);
		vet.vaccinate(catTom);

		System.out.println();
		}
}
