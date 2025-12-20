//WAP to input character from keyboard and check character is vowel or consonant 
//Q3. Write a Java program that takes a single character as input and determines whether it is a vowel (a, e, i, o, u) or 
//			a consonant using a switch-case statement.
import java.util.*;

public class Switvowconspe
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		char ch = sc.nextLine().charAt(0);
		if((ch>=0 && ch<=9)|| (!(ch <='a' && ch<='z') || !(ch <='A' && ch<='Z')))
		{
			System.out.println("no vowel and constant it is digit or special symbol");
		}else{
		if((ch>='A' && ch<='Z'))
		{
			ch = (char)((int)+32);
		}
			switch(ch)
			{
				case 'a','e','i','o','u':
					System.out.println(ch+"Is vowel");
					break;
				default :
					System.out.println("it is not vowel");
			}
		}
		
	}	
}