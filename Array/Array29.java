/*
Q4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.

*/
import java.util.*;
public class Array29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		
		System.out.println("Enter a array Elements : ");
		int a[] = new int[size];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		boolean flag = true;	
		int start  = 0;
		int end = size-1;
		for(int i=0; i<size; i++)
		{
			while(start<=end){
				if(a[start]!=a[end]){
					flag = false;
					break;
				}
			start++;
			end--;
			}
		}
		
		if(flag){
			System.out.print("True ");
			System.out.print("it is a Palindrome array");
		}else{
			System.out.print("it is not Palindrome array");
		}
		
	}
}