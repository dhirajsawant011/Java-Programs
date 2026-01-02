//Q31. Write a java program to display 1 to nth Duck Number.

import java.util.*;
public class Loop31
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: - ");		
		int range = sc.nextInt();
			for(int i=1; i<=range; i++){
				int n=i;
				int temp = 0;
				boolean flag = false;
					while(n>0){
						temp = n%10;
						if(temp == 0){
						flag = true;
						break;
						}
						n=n/10;
						}
							if(flag){
								System.out.println(i);
						}
			}
	}
	
}

