//Q6. Write a Java program to check whether a character is alphabetic or not.

import java.util.*;

public class D02prog06
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet");
		char ch = sc.nextLine().charAt(0);
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			System.out.println("Character is alphabet");
		}else{
			System.out.println("Character is not alphabet");
		}
		
	}

}