//Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;

public class vowelconsonant
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet");
		char ch = sc.nextLine().charAt(0);
	if((ch=='a' || ch =='e' || ch== 'i' || ch=='o' || ch== 'u') || (ch=='A' || ch =='E' || ch== 'I' || ch=='O' || ch== 'U') )
		{
			//ch = (char)((int)+32);
			System.out.println(ch+" is a vowel");
			
			//System.out.println(ch+" is a vowel");
			
		}else{
			System.out.println(ch+" is a consonant");
		}
	}
}