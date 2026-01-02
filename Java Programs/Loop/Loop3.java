//Q3. Write a java program to print all alphabets from a to z. - using while loop

import java.util.*;

public class Loop3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//char ch = sc.nextLine().charAt(0);
		char ch = 'a';
		while (ch<='z'){
			System.out.println(ch);
			ch++;
		}
		
	}
}
