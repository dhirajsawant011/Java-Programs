//Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
public class D02prog05
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num%5==0 && num%11==0){
			System.out.println(num+" Number is divisible by 5 and 11");
		}else{
				System.out.println(num+" Number is not divisible by 5 and 11");
		}
	}
}