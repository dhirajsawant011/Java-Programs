/*
	Q17. Write a java program to find all factors of a number.
*/
import java.util.*;
public class DoWhile17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number");
		int no  = sc.nextInt();
		System.out.print("factorial of a Number :-  ");
		int i=1;
		do{
			if(no%i==0){
				System.out.print(i +" ");
			}
			i++;
		}while(i<=no);

	}
}