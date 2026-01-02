//Q16. Write a java program to find power of a number.

import java.util.*;
public class Fun16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		System.out.print("Enter a index : ");
		int index = sc.nextInt();
		int result = numPow(no,index);
		System.out.print("Power is  : " +result);
		
	}
	
	public static int numPow(int n , int index)
	{

		int pow = 1;
		while(index!=0)
		{
			pow=pow*n;
			
			index--;
			System.out.println(pow);
		}
		return pow;
	}
}