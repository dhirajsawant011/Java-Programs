
//Q37. Write a java program to find LCM of two numbers.

import java.util.*;
public class Loop37
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter a number : - ");
		int a =sc.nextInt();
		System.out.print(" ");
		int b =sc.nextInt();
		
		int min = a > b ? a : b;
		
		while(min > 0){
			if(a % min == 0 && b % min == 0 )
			{
			
				int LCM =( a * b ) / min;
				System.out.print("LCM : " + LCM);
				break;
			}
			min--;
		}
	}
}