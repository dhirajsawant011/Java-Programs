/*

Q4. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.

*/
import java.util.*;

public class Array9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of Array : ");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		int b[] = new int [size];
		
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}

		
		for(int i =0; i<size; i++){
			b[i]= a[i];
		}
		
		System.out.print("Array 2 = { ");
		for(int i =0; i<size; i++){
			System.out.print(b[i] + " ");
		}
		System.out.print(" }");
		
		
	}
}