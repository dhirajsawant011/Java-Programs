//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;

public class D02prog07
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int cp =sc.nextInt(); 
		int sp =sc.nextInt();
		
		if(cp>sp){
			int loss = cp - sp;
			System.out.println("Loss is"+loss);
		}else{
			int profit = cp - sp;
			System.out.println("Profit is "+profit);
		}
	
	}
}

