/*
Q14. Write a java program to check whether a number is palindrome or not.
*/
import java.util.*;
public class DoWhile14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int no=sc.nextInt();
		int rev =0;
		int org= no;
		do{
			rev = (no%10)+ rev*10;
			no = no/10;
		}while(no>0);
		System.out.println(org == rev? "number is palindrome": "not palindrome");
		
	}
}