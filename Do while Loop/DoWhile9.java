/*
Q9. Write a java program to print a multiplication table of any number.
*/
import java.util.*;
public class DoWhile8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int n=sc.nextInt();
		int tab;
		int i=1;
		do{
			tab=i*n;
			System.out.println(i + "  *  " + n + " = " + tab);
			i++;
		}while(i<=10);
		//System.out.println("sum is Even numbers = "+sum);
		
	}
}