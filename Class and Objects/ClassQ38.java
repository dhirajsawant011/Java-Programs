/*
	Q7. WAP to create class name as Prime with two functions 
	void setValue(int no): this function is used for accept number as parameter 
	void checkPrime(): this function can check number is prime or not
*/

import java.util.*;
public class ClassQ38
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int no = sc.nextInt();
		
		Prime fc = new Prime();
		fc.setValue(no);
		fc.checkPrime();
	}
}
class Prime
{
	Scanner sc = new Scanner(System.in);
	int num;
	void setValue(int no)
	{
		num =no;
	}
	void checkPrime()
	{
		if(num <= 1)
        {
            System.out.println(num + " is NOT a Prime Number");
            return;
        }
		
		boolean isPrime = true;
		
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				//System.out.println("WE In"+ i);
				isPrime = false;
				break;
				
			}
		}
		
		if(isPrime)
		{
			System.out.println(num +" Prime Number : ");
		}else{
			System.out.println(num +" No Prime Number : ");
		}
		
			
	}
}