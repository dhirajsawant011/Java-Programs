/*
	Q12. WAP to create class name as Rev with two functions 
void setValue(int …x): this function can accept infinite values from calling 
void rev(): this function can reverse the array and display it

*/

import java.util.*;
public class ClassQ43

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Rev fc = new Rev();
		fc.setValue(5,1,4,6,8);
		fc.rev();
		
	}
}
class Rev
{
	int a[];
	void setValue(int ...x)
	{
			a = x;
	}
	void rev()
	{	
		System.out.println("Before rev array : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");
		}
	
		int mid = a.length/2;
		int start =0;
		int end = a.length-1;
		for(int i=0; i < mid; i++)
		{
			int temp = a[i];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			
		}

		System.out.println(" ");
		
		System.out.println("After rev array : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}