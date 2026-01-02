/*
Q5. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
	
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 
				
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321
				
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11
	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135
				
Case 5 : Store only prime number at the same index of digit.
		Output :- 2573  5  253  25  357  235
*/
import java.util.*;
public class Array40
{
	public static void main(String f[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a [] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		/*
		int choice = sc.nextInt();
		
		
		for(int i =0; i<size; i++)
		{
			int count =0;
			int temp = a[i],num;
			num = temp;//5732
			while(temp!=0)
			{
				temp = temp%10;
				count++;
				temp = temp/10;
				System.out.print(count);
				
			}
			temp = num;
			int min = 0;
			int no =0; 
			for(int j=0; j<=count; j++)
			{
				int rem = temp%10;
				if(min>rem)
				{
					no = rem;
				}
			}
			
			a[i] = no;
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] +" ");
		}*/
		int x=0;	
		for(int i=0;i<4;i++)
		{
			x=x*10+a[i];
		}
		System.out.println(x);
		
	}
}


