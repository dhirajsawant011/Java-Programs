//Q17. Write a java program to find all factors of a number.

import java.util.*;

public class Loop17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: - ");
		int num = sc.nextInt();
		int i=1;
		while(i<=num)
		{
			if(num%i==0){
				System.out.println(" are factor of number :" +num +" : "+i);
			}
			i++;
		}
	}
}
//Example: Factors of 12

//To find the factors of 12, look for numbers that divide 12 evenly:

//12÷1=12
//12÷2=6
//12÷3=4
//12÷4=3
//12÷6=2
//12÷12=1
// Factors of 12 = 1, 2, 3, 4, 6, 12