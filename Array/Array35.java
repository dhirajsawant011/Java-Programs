//Q10. Count the number of duck numbers in an array.

import java.util.*;
public class Array35
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		int a [] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		int rem ;
		int count =0;
		for(int i=0; i<size; i++)
		{
			int no = a[i];
			boolean flag = false;
			while(no!=0){
				rem = no%10;
				
				
				if(rem==0){
					flag = true;
					break;
				}
				no =no/10; 
			}
			if(flag){
				count++;
			}
			
		}
		
		System.out.print("coutn of duck in array = " + count);
		
		
	}
}