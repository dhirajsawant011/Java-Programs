//WAP to input character from keyboard and check character is vowel or consonant 
//Q3. Write a Java program that takes a single character as input and determines whether it is a vowel (a, e, i, o, u) or 
//			a consonant using a switch-case statement.
import java.util.*;
public class Switvowconspe
{   public static void main(String x[])
	{   Scanner xyz  = new Scanner(System.in);
	    System.out.println("enter your choice");
		char ch=xyz.nextLine().charAt(0); //B
		
		
		if ((ch>='0' && ch<='9'))
		{
			  System.out.println("its a digit");
		}
		else  if ((ch >= 33 && ch <= 47) ||  
                 (ch >= 58 && ch <= 64) ||  
                 (ch >= 91 && ch <= 96) || 
                 (ch >= 123 && ch <= 126)) {
				 ch = (char)(int) ch;
            System.out.println("It's a special symbol");
        } 
		
		else{
				switch(ch)
				{
				case 'a','e','i','o','u':
				System.out.println("Vowel");
				break;
				case 'A','E','I','O','U':
				System.out.println("Vowel");
				break;
				default:
				System.out.println("Cosonent");
		  }
		}
	}
}

