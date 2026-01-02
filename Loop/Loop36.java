
//	 Q36. Write a java program to find HCF (GCD) of two numbers.


import java.util.*;
public class Loop36
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter a number : - ");
		int a =sc.nextInt();
		System.out.print(" ");
		int b =sc.nextInt();
		
		int min = a > b ? a : b;
		
		while(min>0){
			System.out.println("no " + min +"  hcf find");

			if(a % min == 0 && b % min == 0 )
			{
				System.out.print("yes " + min + "  HCF find" );
				break;
			}
			min--;
		}
	}
}