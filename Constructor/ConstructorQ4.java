/*
	Q4. Create an Employee class with fields name and salary, initialized with constructor.
	Write a method validateSalary() that checks:
	Salary must be between 10,000 and 1,00,000 (inclusive).
	If valid → Print “Valid salary”
	Else → Print “Invalid salary”
	
	
	Concepts Used:
	✔ Constructor
	✔ Logical AND operator (&&)
*/

class Employee
{
	int sal;
	
	Employee(int sal)
	{
		this.sal = sal;
	}
	
	void validateSalary()
	{
		if(sal>=10000 && sal<=100000)
		{
			System.out.println("Valid Salary");
		}
		else
		{
			System.out.println("Invalid Salary");
		}
	}

}
public class ConstructorQ4
{
	public static void main(String x[])
	{
		Employee em = new Employee(9000);
		em.validateSalary();
	}
}
