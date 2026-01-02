//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
import java.util.*;

public class Loop2
{
	public static void main(String x[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		int i =num;
		while(i>=1){
			System.out.println(i);
			i--;
		}
	}
}