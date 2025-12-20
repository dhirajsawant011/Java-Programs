/*
Q5. Write a java program to print all odd numbers between 1 to 100.- using while loop
*/
import java.util.*;
public class DoWhile5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int n=sc.nextInt();
		System.out.println("Even Numbers  ");
		int i=1;
		
		do{
			if(i%2==1){
			System.out.println(i);
			}
			i++;
		}while(i<=n);
		
	}
}
