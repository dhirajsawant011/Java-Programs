/*

Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.

*/
import java.util.*;
public class Array33
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size: ");
		int size = sc.nextInt();
			
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0; i<size; i++)
		{
			int num = a[i];
			boolean isPrime = true;
			
			
			if(num<=1){
				isPrime = false;
			}
			else
			{
				int j=2;
				while(j <= num/2){
					
					if(num%j==0){
						isPrime = false;
						break;
					}
					j++;
				}
			}
			if(isPrime){
				count++;
			}
		}
		System.out.print("Count of prime numbers " + count);
	}
}