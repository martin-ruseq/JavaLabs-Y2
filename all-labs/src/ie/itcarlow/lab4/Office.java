package ie.itcarlow.lab4;

import java.util.Arrays;

//Student Name: 	Marcin Rusiecki
//Student ID: 		C00263263
//Date: 			26/10/2021

public class Office
{
	private int officeNumber;
	private String officeInfo;
	private int employeesInOffice = 2;
	
	private static int nextFreeOffice = 100;					// The office number starts from 100
	
	private Employee[] emp = new Employee[employeesInOffice];			// Array to keep only two emplyees in the office

	//CONSTRUCTOR
	public Office()
	{
		officeNumber = nextFreeOffice;
		nextFreeOffice++;
	}
	
	//SETTERS
	public void setOfficeNumber(int officeNumber)
	{
		this.officeNumber = officeNumber;
	}
	public void setOfficeInfo(String officeInfo)
	{
		this.officeInfo = officeInfo;
	}
	public static void setNextFreeOffice(int nextFreeOffice)
	{
		Office.nextFreeOffice = nextFreeOffice;
	}
	
	//GETTERS
	public int getOfficeNumber()
	{
		return officeNumber;
	}
	public String getOfficeInfo()
	{
		return officeInfo;
	}
	public int getEmployeesInOffice()
	{
		return employeesInOffice;
	}
	public static int getNextFreeOffice()
	{
		return nextFreeOffice;
	}

	//METHODS
	public void employeeToOffice(Employee employee)
	{
		if(emp[0] == null)
		{
			emp[0] = employee;
		}
		else if (emp[1] == null)
		{
			emp[1] = employee;
		}
		else
		{
			System.out.println("The office is full!");
		}
	}
	public int numEmployeesInOffice()
	{
		if (emp[0] == null)
		{
			return 0;
		}
		else if (emp[1] == null)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
	public String toString()
	{
		return "Office Number: " + officeNumber + "\n" + "Office Info: " + officeInfo + "\n" + "Employees in Office: \n" + Arrays.toString(emp) + "(" + numEmployeesInOffice() + ")";
	}
	
}
