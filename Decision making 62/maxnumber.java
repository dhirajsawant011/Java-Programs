// Q11. Write a java program to find a maximum between three numbers.

import java.util.*;
public class maxnumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int a,b,c;
		a	=num%10; //3		
		b	=(num/10)%10; //2
		c	=num/100;  //1
		
		if((a>b && a>c))
		{
			System.out.println(a+" is maximum");
		}else if((b>a && b>c)){
			System.out.println(b+" is maximum");
		}else{
			System.out.println(c+" is maximum");
		}
	}
}