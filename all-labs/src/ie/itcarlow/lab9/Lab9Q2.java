package ie.itcarlow.lab9;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			02/12/2021

//main class
public class Lab9Q2
{
	public static void main(String args[])
	{
		Car car1 = new Car();			//create new car object
		Hgv truck1 = new Hgv();			//careate new hgv object
		
		//input
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");
		car1.setPrice(24000.0);
	
		truck1.setWheels(18);
		truck1.setPass(2);
		truck1.setCargo(3200);
		truck1.setPrice(90000.0);
		
		//output
		System.out.println("-- Car1 --");
		System.out.println("Wheels: " + car1.getWheels());
		System.out.println("Passengers: " + car1.getPass());
		System.out.println("Type: " + car1.getType());
		System.out.println("Price: " + car1.getPrice());
		System.out.println("Importy Duty: " + car1.calculateDuty());
		System.out.println("");
		System.out.println("-- Truck1 --");
		System.out.println("Wheels: " + truck1.getWheels());
		System.out.println("Passengers: " + truck1.getPass());
		System.out.println("Cargo: " + truck1.getCargo());
		System.out.println("Price: " + truck1.getPrice());
		System.out.println("Import Duty: " + truck1.calculateDuty());
		
	}
}
