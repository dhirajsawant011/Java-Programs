/*
Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

*/
import java.util.*;
public class DoWhile2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int n=sc.nextInt();
		
		int i=n;
		
		do{
			System.out.println(i);
			i--;
		}while(i>=1);
	}
}
