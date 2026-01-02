/*
	Q4. WAP to create  class name as Rev with two functions 
   void setValue(): this function is used for accept number 
   void showRev(): this function is used for reverse the number

*/

import java.util.*;
public class ClassQ35
{
	public static void main(String x[])
	{
		Rev fc = new Rev();
		fc.setValue();
		fc.showRev();
	}
}
class Rev
{
	Scanner sc = new Scanner(System.in);
	int num;
	void setValue()
	{
		System.out.print("Enter a Number : ");
		num = sc.nextInt();
	}
	void showRev()
	{
		int temp = num;
		int rev = 0;
		while(temp>0)
		{
			int digit = temp%10;
			rev = rev*10+digit;
			temp=temp/10;
		}
		System.out.println("Reverse Number is " +rev );
		
	}
}