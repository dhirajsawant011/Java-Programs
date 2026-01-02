/*
	Q8.WAP to create class name as Duck with two functions 
	void setValue(int no): this function is used for accept number as parameter 
	void checkDuck(): this function is used for check number is duck or not 
*/


import java.util.*;
public class ClassQ39
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int no = sc.nextInt();
		
		Duck fc = new Duck();
		fc.setValue(no);
		fc.checkDuck();
	}
}
class Duck
{
	Scanner sc = new Scanner(System.in);
	int num;
	void setValue(int no)
	{
		num =no;
	}
	void checkDuck()
	{
		
		int temp = num;
		 boolean isDuck = false;
		while(temp > 0)
		{
			int digit = temp%10;
			
			if(digit==0)
			{
				isDuck = true;
				break;
			}
			temp = temp/10;
		}
		
		if(isDuck)
		{
			System.out.println("Duck Number");
		}else
		{
			System.out.println("Not Duck Number");
		}
	}
}