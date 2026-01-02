//Q20. Write a java program to swap first and last digits of a number.


import java.util.*;
public class Fun20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		 sflNum(no);
		//System.out.println("Swapped digit " + result);
	}
	
	public static void sflNum(int n)
	{
		
		int org = n;
		int last = n%10;//4
		int temp = n;
		
		System.out.println(last);
		
		while(temp>0){
			temp = temp/10;
			int divisor = divisor*10;// 1000
		}
		
		
		int first = n;
		while(first>9){
			first = first/10;//1
			
		}
		
		if(count==1) 
		{
			//return org;
			System.out.print(org);
		}

		int middle = org%divisor;// 1234%1000=234
		middle = middle/10;//234/10=23 
		
		System.out.println(middle);
	
		int swap = last * divisor + middle * 10 + first;
		System.out.println("Swapped number : " + swap);
	}
}