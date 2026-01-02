/*
Q13. Write a java program to enter a number and print its reverse.
*/
import java.util.*;
public class DoWhile13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int no=sc.nextInt(); //1234
		int rev=0 ;//4 //43
		do{
			rev = ((no%10)+(rev*10)); //4+(0*10) =4 // 3+(4*10) =43 //
			no = no/10;//1 //2 //3 //4 //0
		}while(no>0);
		System.out.println("reverse number is = "+rev);
		
		
	}
}