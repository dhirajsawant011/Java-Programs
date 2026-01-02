/*

	Q1. Problem: Exam class with marks of 5 subjects.
	Rules:
	Pass only if each subject ≥ 40
	Division based on percentage:
	≥ 75 → Distinction
	≥ 60 → First
	≥ 45 → Second
	Else → Pass

	Functions:
	isPass()
	calculatePercentage()
	getDivision()
	
*/

public class ClassQ31
{
	public static void main(String x[])
	{
		int Marathi = 40;
		int Hindi   = 40;
		int English = 40; 
		int Science = 40;
		int Math    = 40;
		
		Exam ex = new Exam();
		ex.isPass( Marathi, Hindi, English , Science, Math);
		ex.calculatePercentage(  Marathi, Hindi, English , Science, Math);
		ex.getDivision();
	}
}

class Exam
{
	
	int per;
	void isPass(int Marathi, int Hindi, int English, int Science, int Math)
	{
		if(Marathi>=40 && Hindi>=40 && English>=40 && Science>=40 && Math>=40)
		{
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
	
	void calculatePercentage(int Marathi, int Hindi, int English, int Science, int Math)
	{
		int total = Marathi+ Hindi+ English + Science+ Math;
		per = total/5;
		System.out.println("Percentage : "+per +"%");
	}
	//	≥ 75 → Distinction
	//	≥ 60 → First
	//	≥ 45 → Second
	//	Else → Pass

	void getDivision()
	{
		if(per>=75)
		{
			System.out.println("Distinction");
		}else if(per>=60)
		{
			System.out.println("First");
		}else if (per>=45)
		{
			System.out.println("Second");
		}else
		{
			System.out.println("Pass");
		}
	}
}