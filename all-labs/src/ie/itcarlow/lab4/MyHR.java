package ie.itcarlow.lab4;

import java.util.Scanner;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			26/10/2021

public class MyHR
{

	public static void main(String[] args)
	{
		String firstName;
		String lastName;
		String empType;
		String carInfo = "";
		String street;
		String city;
		String county;
		int maxEmployees = 5;
		int numOfOffices = 3;
		int nextEmplyeeSpace = 0;
		int nextOffice = 0;
		int i;
		int i2;
		int officeIndex;
		int addOptionCount = 0;
		
		
		Employee [] employees = new Employee[maxEmployees];
		Office [] offices = new Office[numOfOffices];
		
		System.out.println(">> WELCOME TO MY HR SYSTEM <<");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int option = 0;
		
		for (officeIndex = 0 ; officeIndex < numOfOffices; officeIndex ++)
		{
			offices[officeIndex] = new Office();
		}
		
		while (option != 4)
		{
			System.out.println("");
			System.out.println("1. Add new emplyee record");
			System.out.println("2. List all emplyees");
			System.out.println("3. List all offices");
			System.out.println("4. Exit \n");
			
			System.out.print("Select the option: ");
			System.out.println("");

			option = in.nextInt();
			in.nextLine();
			
			switch(option)
			{
				case 1:
				{
					if (addOptionCount == 5)
					{
						System.out.print(" ### ERROR! CAN NOT ADD MORE EMPLOYEES! ### \n");
						break;
					}
					else
					{
						System.out.println("_______________________________");;
						System.out.print("First Name: ");
						firstName = in.nextLine();
						System.out.print("Last Name: ");
						lastName = in.nextLine();
						System.out.print("Emplyee type (Staff or Manager): ");
						empType = in.nextLine();
						System.out.print("Street: ");
						street = in.nextLine();
						System.out.print("City: ");
						city = in.nextLine();
						System.out.print("County: ");
						county = in.nextLine();
						
						if (empType.equalsIgnoreCase("Manager"))
						{
							System.out.print("Car info: ");
							carInfo = in.nextLine();
						}
						
						Address address = new Address(street, city, county);
						Employee employee = new Employee(firstName, lastName, address, empType, carInfo);
						
						employees[nextEmplyeeSpace] = employee;
						nextEmplyeeSpace++;
						offices[nextOffice].employeeToOffice(employee);
						if (offices[nextOffice].numEmployeesInOffice() == 2)
						{
							nextOffice++;
						}
						addOptionCount++;
						break;
					}
				}
				case 2:
				{
					for (i = 0; i < nextEmplyeeSpace; i++)
					{
						System.out.println(employees[i] + "\n");
						System.out.print("");
						System.out.println("Employees in the company: " + Employee.getCountEmloyees());
					}
					break;
				}
				case 3:
				{
					for (i2 = 0; i2 < offices.length; i2++)
					{
						System.out.println(offices[i2] + "\n");
						System.out.println("");
					}
					break;
				}
			}
		}
	}
}
