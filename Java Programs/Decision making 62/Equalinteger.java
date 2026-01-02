 //Q13. Write a java program to accept two integers and check whether they are equal or not.
 
import java.util.*;

public class Equalinteger
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b){
			System.out.println("Both integers are equal");
		}else{
			System.out.println("Both integers are not equal");
		}
		
	}
}
