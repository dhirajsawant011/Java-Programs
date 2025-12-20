/*
Q7. Write a java program to find the sum of all even numbers between 1 to n.
*/
import java.util.*;
public class DoWhile7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int n=sc.nextInt();
		int sum =0;
		int i=1;
		do{
			if(i%2==0){
			sum = sum+i;
			}
			i++;
		}while(i<=n);
		System.out.println("sum is Even numbers = "+sum);
		
	}
}