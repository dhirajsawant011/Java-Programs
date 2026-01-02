//Q4. Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;

public class checknegpositive
{
	public static void main(String x[])
	{	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-");
		int num = sc.nextInt();
		if(num>0){
			System.out.println(num+" its positive Number");
		}else if(num==0){
			System.out.println(num+" its Zero");
		}else{
			System.out.println(num+" its negative number");
		}
	}
}