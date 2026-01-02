	/*
		Q9. Create an Employee class with:
		empId
		name
		salary
		Use constructor to initialize values.
		Create an array of 10 employees.
		Write a method filterHighSalary() that prints only those employees whose salary > 30000.
		Concepts Used:
		✔ Array of objects
		✔ Constructor for object initialization
		✔ Logical operator (salary > 30000)
		Explanation:
		Constructor loads employee data.
		Using loops and logical conditions, filter and display selected employees.
	*/
	import java.util.*;
	class Employee
	{
		int empId;
		String name;
		int salary;
		Employee(int empId,String name,int salary)
		{
			this.empId = empId;
			this.name = name;
			this.salary = salary;
		}
		void filterHighSalary()
		{
			if(salary >30000)
			{
				System.out.println("empId: " +empId);
				System.out.println("name: " +name);
				System.out.println("Salary: " +salary);
			}
		}
	}

	public class ConstructorQ9
	{
		public static void main(String x[])
		{	
			Scanner sc = new Scanner(System.in);
			Employee emp[] = new Employee[3];
			
			for(int i=0; i<emp.length; i++)
			{
				System.out.print("Enter a Employee Id     :");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter a Employee Name   :");
				String name = sc.nextLine();
				
				System.out.print("Enter a Employee salary :");
				int salary = sc.nextInt();
				
				emp[i] = new Employee(id,name, salary);
			}
			
			System.out.println("filter and display selected employees ");
			for(int i=0; i<emp.length; i++)
			{
				emp[i].filterHighSalary();
			}
		}
	}