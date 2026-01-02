//	Q35. Write a java program to enter a number and print it in words.

import java.util.*;
public class Loop35
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter a number : - ");
		int no =sc.nextInt();
		int rev =0;
		while(no>0){
			rev = ((no%10)+(rev*10));
			no = no/10;
		}
		int temp=0;
		while(rev>0){
			temp = rev%10;
			switch(temp){
				case 0:
					System.out.print(" Zero  ");
					break;
				case 1:
					System.out.print(" One  ");
					break;
				case 2:
					System.out.print(" Two  ");
					break;
				case 3:
					System.out.print(" Three  ");
					break;
				case 4:
					System.out.print(" Four  ");
					break;
				case 5:
					System.out.print(" Five  ");
					break;
				case 6:
					System.out.print(" Six  ");
					break;
				case 7:
					System.out.print(" Seven  ");
					break;
				case 8:
					System.out.print(" Eight  ");
					break;
				case 9:
					System.out.print(" Nine ");
					break;
				default:
					System.out.print("Invalid Choice");
					break;
				
			}
			rev = rev/10;
		}
		
		
	}
}