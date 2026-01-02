/*
	Q5. WAP to create class name as Perfect with two methods 
	void setNum(int no): this function can accept number as parameter 
	void findPerfect(): this function can check number is perfect or not
*/

import java.util.*;
public class ClassQ36
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int no = sc.nextInt();
		
		
		Perfect fc = new Perfect();
		fc.setNum(no);
		fc.findPerfect();
	}
}
class Perfect
{
	int num;
	void setNum(int no)
	{
		num = no;
	}
	void findPerfect()
	{
		
		int temp = num;
		int sum =0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		
		if(num==sum)
		{
			System.out.println("Perfect Number  ");
		}else{
			System.out.println("Not Perfect Number ");
		}
		
	}
}