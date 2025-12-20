/*
Q4. Write a java program to print all even numbers between 1 to 100.- using while loop
*/
import java.util.*;
public class DoWhile4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int n=sc.nextInt();
		System.out.println("Even Numbers  ");
		int i=1;
		
		do{
			if(i%2==0){
			System.out.println(i);
			}
			i++;
		}while(i<=n);
		
	}
}
