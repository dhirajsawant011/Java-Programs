/*
	Q8. Create a Student class with 3 subject marks:
	m1, m2, m3 (initialize via constructor)
	Write a method:
	calculateResult()
	Total = m1 + m2 + m3
	Percentage = total / 3
	If any subject < 35 → print “Fail”
	Else print Percentage and Grade:
	
	
	≥ 75 → Distinction
	≥ 60 → First Class
	≥ 50 → Second Class
	Else → Pass
	
	
	Explanation:
	This requires combined logic:
	OR logic for fail
	Else-if ladder for grading
	Arithmetic + constructor initialization
*/
class Student
{
	int m1, m2, m3;
	Student(int m1,int m2,int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}
	void calculateResult()
	{
		
		
		if(m1>=35 || m2>=35 || m3>=35)
		{
			int total = m1 + m2 + m3;
			int percentage = total / 3;
			System.out.println("your passed with " +percentage+ " %  Percentage");
		}
		else
		{
			System.out.println("You failed in a subject");
		}
	}
}

class ConstructorQ8
{
	public static void main(String x[])
	{
		Student st = new Student(36,50,50);
		st.calculateResult();
	}
}

