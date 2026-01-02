/*
Q1. Write a java program to print all natural numbers from 1 to n. using while loop.

*/
import java.util.*;
public class DoWhile1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int n=sc.nextInt();
		
		int i=1;
		
		do{
			System.out.println(i);
			i++;
		}while(i<=n);
	}
}
