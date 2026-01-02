/*
	Q6. WAP to create class name Armstrong with two methods 
	void setNum(int no): this function can accept number as parameter 
	void checkArm(): this function can check number is armstrong or not 
	
*/

import java.util.*;
public class ClassQ37
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int no = sc.nextInt();
		
		
		Armstrong fc = new Armstrong();
		fc.setNum(no);
		fc.checkArm();
	}
}
class Armstrong
{
	
	int num;
	void setNum(int no)
	{
		num = no;
	}
	void checkArm()
	{
		
			int temp = num;
			int count=0;
			while(temp>0)
			{
				count++;
				temp = temp/10;
			}
			temp =num;
			int sum =0;
			while(temp>0)
			{
				int digit = temp%10;
				int pow = 1;
				for(int i=1; i<=count; i++)
				{
					pow = pow*digit;
				}
				sum = sum+pow;
				temp = temp/10;
			}
			System.out.println(sum);
		
			if(sum==num)
			{
				System.out.println("Armstrong Number ");
			}else{
				System.out.println("Not Armstrong Number ");
			}
	}
}