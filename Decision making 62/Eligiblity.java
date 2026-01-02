// Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.*;

public class Eligiblity
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("eligible for vote.");
		}else{
			System.out.println("Not eligible for vote.");
		}
	}
}
