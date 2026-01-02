//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;

public class Loop9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int i =1;
		int tab = 1;
		while(i<=n){
			tab = n*i;
			System.out.println(tab);
			i++;
		}
	
	}
}