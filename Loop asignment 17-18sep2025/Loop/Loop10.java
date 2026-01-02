//Q10. Write a java program to count the number of digits in a number.

import java.util.*;

public class Loop10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int no = sc.nextInt();
		int count =0;
		while( no!=0){
			no = no/10;
			++count;
		}
		System.out.println("digits count is "+count);
	}

}