//Q26. Write a java program to Check Number Is Neon Number or Not.

import java.util.*;

public class Loop26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int square = no*no;
		int sum=0;
		while(square > 0)
		{
			sum = sum+(square%10);
			square = square/10;
			
		}
		
		if(sum == no){
			System.out.println("Number is neon");
		}else{
			System.out.println("Number is not neon");
		}
		
	}
}