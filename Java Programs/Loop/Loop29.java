//Q29. Write a java program to display 1 to nth Prime Number.

import java.util.*;

import java.util.*;

public class Loop29 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int range = sc.nextInt();

        System.out.println("Prime numbers are: ");
		int n=2;
		while(n<=range)
		{
            boolean isPrime = true;
			int i=2;
			while(i<=n/2)
			{
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
				i++;
            }
            if (isPrime) {
                System.out.println(n);
            }
			n++;
        }
    }
}
