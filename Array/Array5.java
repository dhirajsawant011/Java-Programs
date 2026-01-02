/*
Q5. Write a Java program to count even & odd values from an array.
Input:
	Array Size = 7
	Array Elements = 12 17 24 39 40 55 70
Output:
	Count of Even Values = 4
	Count of Odd Values = 3
Explanation:
	Initialize counters: evenCount = 0, oddCount = 0.
	or each element in the array:
	If divisible by 2 → increase evenCount.
	Otherwise		  → increase oddCount.
	Final counts are displayed.
*/
import java.util.*;
public class Array5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size : ");
		int size = sc.nextInt();
		
	
		int a[];
		a= new int[size];
		
		System.out.println("Enter a Element : -");
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
		
		
		int evenCount = 0, oddCount = 0;
		for(int i=0; i<size; i++)
			{
				if(a[i]%2==0){
					evenCount++;
				}else{
					oddCount++;
				}
			}
		System.out.println(" Count of Even Values  = "+ evenCount + "   ");
		System.out.print(" Count of Odd Values   = "+ oddCount);
	
	}
}
