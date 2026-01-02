/*
Q10. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.

*/
import java.util.*;
public class Array15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		int a[] = new int [size];
		System.out.print("Enter b array size : ");
		int size1 = sc.nextInt();
		int b[] = new int [size1];
	
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<size1; i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				if(a[i]==b[j]){
					System.out.print(b[j] +" ");
				}
			}
		}
	}
}