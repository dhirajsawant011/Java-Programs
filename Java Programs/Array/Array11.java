/*
	Q6. Write a java program to give an array, find the second largest element.	
	Input : Array = {12, 35, 1, 10, 34, 1}
	Output : Second largest = 34
	Explanation:
	First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/

import java.util.*;
public class Array11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array : ");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		System.out.println("Enter  a array element : ");
		for(int i =1; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		for(int i=0; i<size; i++)
		{
			if(a[i]>max){
				max = a[i];
			}
		}
		
		int smax = a[0];
		for(int i=0; i<size; i++)
		{
			if(a[i]>smax && a[i]!=max){
				smax = a[i];
			}
		}
		System.out.print("smax =" +smax);
	}
}