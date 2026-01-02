/*
	Q16. Write a java program to find power of a number.
*/
import java.util.*;
public class DoWhile16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a base Number");
		int base  = sc.nextInt();
		System.out.print("Enter a index Number ");
		int index = sc.nextInt();
		int pow=1;
		int i=1;
		do{
			pow = pow*base; //1*5 =5 //5*5 = 25 // 25 *5 = 125
			i++;
		}while(i<=index);
		
		System.out.println(" Power is =" + pow);
		
		
		
	}
}