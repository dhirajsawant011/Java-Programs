	//Q1. Problem:
	//Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
	//	1.Calculate the total marks of each student.
	//	2.Find the student with the highest average marks.
	//	3.Display the list of students who have failed in any subject (marks < 35).
	//Explanation:
	//This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.

	import java.util.*;
	class Student
	{
		private int rollNo;
		private String name;
		private int marks[];
		
		private int total;
		private double average;
		private boolean failed;
		
		void setRollNo(int rollNo)
		{
			this.rollNo = rollNo;
		}
		
		int getRollNo()
		{
			return rollNo;
		}
		
		
		void setName(String name)
		{
			this.name = name;
		}
		
		String getName()
		{
			return name;
		}
		
		
		void setMarks(int marks[])
		{
			this.marks = marks;
			
			total = 0;
			failed = false;
			
			for(int i=0; i<marks.length; i++)
			{
				total = total+marks[i];
				
				if (marks[i] < 35) 
				{
					failed = true;
				}
			}
			average = total * 1.0 / marks.length;
		}
		
		int getTotal() {
			return total;
		}
		
		double getAverage() {
			return average;
		}
		
		boolean hasFailed() {
			return failed;
		}
		
		int[] getMarks()
		{
			return marks;
		}
	}

	public class stuPojo
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of students: ");
			int n = sc.nextInt();
			Student s[] = new Student[n];
			for(int i=0; i<n; i++)
			{
				s[i] = new Student();
				
				System.out.print("Enter a Student Roll No : ");
				int rollNo = sc.nextInt();
				s[i].setRollNo(rollNo);
				
				sc.nextLine();                
				System.out.print("Enter a Student Name : ");
				String name = sc.nextLine();
				s[i].setName(name);
				
				
				System.out.println("Enter a marks ");
				int marks[] = new int[3];
				for(int j=0; j<marks.length; j++)
				{
					marks[j] = sc.nextInt();
				}
				
				sc.nextLine();
				s[i].setMarks(marks);
			}
			
			//Display data
			
			
			System.out.println("\n--- Student Details ---");
			//for (int i = 0; i < n; i++) {
			//
			//    System.out.println("RollNo : " + s[i].getRollNo());
			//    System.out.println("Name   : " + s[i].getName());
			//    System.out.println("Total  : " + s[i].getTotal());
			//    System.out.println("Average: " + s[i].getAverage());
			//
			//    // FIXED: Correct condition
			//    System.out.println("Result : " + (s[i].hasFailed() ? "Fail" : "Pass"));
			//    System.out.println();
			//}
			for(int i=0; i<s.length; i++)
			{
				System.out.println("RollNo :" + s[i].getRollNo());
				System.out.println("Name   :" + s[i].getName());
				System.out.println("Total  :" + s[i].getTotal());
				System.out.println("Average:" + s[i].getAverage());
				System.out.println("Result :" +(s[i].hasFailed() ? "Fail" : "Pass"));
			}
		}
	}
