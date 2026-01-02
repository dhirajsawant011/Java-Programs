/*
	Q1. WAP to create class name as Table with functions 
	void setValue():  this function is used for accept the number as input parameter 
	void showTable(): this function can display the table of numbers.

*/
import java.util.*;
public class ClassQ32
{
	public static void main(String x[])
	{
		Table tb = new Table();
		tb.setValue();
		tb.showTable();
	}
}

class Table
{
	Scanner sc = new Scanner(System.in);
	int num;	
	
	void setValue()
	{
		System.out.print("Enter a number : ");
		num =sc.nextInt();
	}
	
	void showTable()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i + " *" +num + " = "+(num*i) );
		}
	}
}