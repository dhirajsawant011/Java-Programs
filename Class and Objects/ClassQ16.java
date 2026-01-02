/*
	16. Generate Multiplication Table
	Create a class MultiplicationTable with a method printTable to print the table of a given number.
	Explanation: Explains nested loops and formatted printing.
*/

import java.util.*;
public class ClassQ16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number  : ");
		int no = sc.nextInt();
		
		MultiplicationTable pc  = new MultiplicationTable();
		pc.printTable(no);
	}
} 


class MultiplicationTable
{
	void printTable(int n)
	{		
		System.out.println( n + " Table");
		for(int i=1; i<=10; i++)
		{	
			System.out.println(n+" * " +i+ " = " + (n*i));
		}
		
	}
}