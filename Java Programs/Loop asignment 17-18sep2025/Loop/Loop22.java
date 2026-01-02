//Q22. Write a java program to Check Number Is Perfect Number or Not.


import java.util.*;
public class Loop22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int no = sc.nextInt();
		int i,sum=0;
		 i=1;
		while(i < no)
		{
			if(no%i==0){
				sum = sum+i;
			}
			i++;
			
		}
		String msg = no==sum? "Perfect number":"Not Perfect number";
		System.out.println(msg);
	}
}

//Example:

//Take 28:

// Divisors of 28 (excluding 28):
// 1, 2, 4, 7, 14

// Sum:1+2+4+7+14=28   

//Since the sum of its proper divisors equals the number, 28 is a perfect number.