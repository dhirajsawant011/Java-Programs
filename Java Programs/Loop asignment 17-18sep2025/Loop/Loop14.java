//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class Loop14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int no = sc.nextInt();
		int temp = no;
		int rev = 0;
		while( no!=0){
			
			rev = (no%10)+rev*10; //first  121%10+0*10 =1+0=1 //second 12%10+1*10 = 2+10 = 12 //third = 1%10+12*10 = 1+120 = 121
			no 	=no/10; //remove element first 121/10 = 12  //second 12/10 = 1 //third   1/10 = 1
		}
		String msg = temp == rev ? "it is a palindrome number" : "it is not a palindrome number"; 
		System.out.println(msg);
		
	}
	
}