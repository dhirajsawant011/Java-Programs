//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;

public class D02prog07
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a cost price");
		int cp =sc.nextInt(); 
		System.out.println("Enter a selling price");
		int sp =sc.nextInt();
		
		if(cp<sp){
			int  profit= sp - cp;
			System.out.println("Profit is "+profit);
		}else{
			int loss = cp - sp;
			System.out.println("Loss is "+loss);
		}
		
	
	}
}

