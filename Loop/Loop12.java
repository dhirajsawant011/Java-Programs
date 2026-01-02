//Q12. Write a java program to calculate the product of digits in a number.
import java.util.*;
public class Loop12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int no = sc.nextInt(); //1234
		int product = 1;
		int i =0;
		while(no!=0){
				product = product *(no%10); //4 extract last element
				no=no/10; 			//4 remove (4 ) last element 
		}
		System.out.println("product of all Digits "+product);
	}
}
