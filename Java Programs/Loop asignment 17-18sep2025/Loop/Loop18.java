//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class Loop18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			
			int last = no%10;

		while(no>9){
			
			no = no/10;
		}
		System.out.println("First Digit is " + no);
		
	
		System.out.println("Last Digit is " + last);
	}
}