//Q14. Write a java program to check whether a number is palindrome or not.


import java.util.*;
public class Fun14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		palNum(no);
		
		
	}
	
	public static void palNum(int no)
	{
		int rev =0;
		int org = no;
		while(no !=0)
		{
			int digit = no%10;
			rev = rev*10+digit;
			no=no/10;
			
		}
		no = org;
		if(rev == no)
		{
			System.out.print("Number is Palindrome");
		}
		else
		{
			System.out.print("Number is Not Palindrome");
		}
		
		//int result = no == rev ? "No is Palindrome":No is Palindrome;
		
	}
}