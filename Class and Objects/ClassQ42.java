/*
	Q11. WAP to create class name as Sort with two functions 
	void setValue(int …x): this function can accept infinite value 
	void sort(): this function can perform sorting on variable argument array
	void display(): this function can display the data of array before sorting and after
	sorting 
*/

import java.util.*;
public class ClassQ42

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Sort fc = new Sort();
		fc.setValue(100,10,20,30,40,50,200);
		fc.display();
		
	}
}
class Sort
{
	int a[];
	void setValue(int ...x)
	{
			a = x;
	}
	void display()
	{	
		System.out.println("Before Sorting array : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");
		}
	
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		System.out.println(" ");
		
		System.out.println("After Sorting array : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}