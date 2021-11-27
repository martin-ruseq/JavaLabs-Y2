package ie.itcarlow.lab8;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			27/11/2021

public class Student extends Person
{
	private String course;
	
	//constructor
	public Student(String name, String course)
	{
		super(name);
		this.course = course;
	}
	
	public String getDescription()
	{
		return "A student studying " + course;
	}
}
