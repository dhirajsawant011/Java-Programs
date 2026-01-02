//Q23. Write a java program to Check Number Is Duck Number or Not.

import java.util.*;
public class Loop23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no ,rem=0;
		
		System.out.println("Enter a number");
		no = sc.nextInt();
		boolean flag = false;
		
		while(no!=0)
		{
			rem = no%10;
			no = no/10;
			if(rem ==0){
				flag = true;
			}
		}
		if(flag){
			System.out.println("its a duck number");
		}else{
			System.out.println("its not a duck number");
		}
	}
}