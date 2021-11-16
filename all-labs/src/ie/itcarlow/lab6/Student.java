package ie.itcarlow.lab6;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			08/11/2021

public class Student extends Person
{
	public static int numCourses = 0;
	String[] courses = new String[5];
	int[] grades = new int[5];
	
	//constructor
	public Student(String studentName, String studentAddress)
	{
		super(studentName, studentAddress);
	}
	//setters & getters
	public void addCourseGrade(String course, int grade)
	{
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
	}
	public double getAverageGrade()
	{
		int sum = 0;
		double average;
		
		for (int i = 0; i < numCourses; i++)
		{
			sum += grades[i];
		}
		
		average = sum / numCourses;
		
		return average;
	}
		
	//toString() method
	public String toString()
	{
		return "Student: " + super.toString();
		
	}
	
	//misc methods
	public void printGrades()
	{
		for(int i = 0; i < numCourses; i++)
		{
			System.out.print(courses[i]+ ":" + grades[i] + ", " );
		}
	}
}
