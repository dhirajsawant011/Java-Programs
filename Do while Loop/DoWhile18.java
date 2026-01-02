/*
	Q18. Write a java program to find the first and last digit of a number.
*/
import java.util.*;
public class DoWhile18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number");
		int no  = sc.nextInt();
		int last = no%10;
		int i=1;
		do{
			//System.out.print(i);
			i++;
		}while(i<=no);
		
		System.out.println("Last no is = "+last);
		
	}
}