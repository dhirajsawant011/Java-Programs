/*
	Q1. Create a Student class with fields: name, marks.
	Use a parameterized constructor to initialize both fields.
	Write a method checkResult() that prints "Pass" if marks ≥ 35, otherwise "Fail".
	Create 3 student objects and print their results.
	Concepts Used:
	✔ Parameterized constructor
	✔ If–else logic
	Explanation:
	The constructor sets the student’s name and marks.
	Then you apply simple logical condition (≥ 35).
*/

class Student
{
	int marks;
	String name;
	Student(int marks, String name)
	{
		this.marks = marks;
		this.name = name;
	}
	
	void checkResult(){
		if(marks>=35)
		{
			System.out.println(name + " Pass");
		}
		else
		{
			System.out.println(name + " Fail");
		}	
	}
}

public class ConstructorQ1
{
	public static void main(String x[])
	{
		Student s1 = new Student(34,"Dhiraj");
		s1.checkResult();
		
		Student s2 = new Student(36,"DRS");
		s2.checkResult();
		
		Student s3 = new Student(90,"RDS");
		s3.checkResult();
	}
}

