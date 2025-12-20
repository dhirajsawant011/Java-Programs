/*
	Q3. Write a Java program to display even & odd values from an array.
	Input:
	Array Size = 6
	Array Elements = 11 20 33 42 55 60
	Output:
	Even Values = 20 42 60
	Odd Values = 11 33 55
	Explanation:
	Traverse the array element by element.
	If an element is divisible by 2, it is even. Otherwise, it is odd.
	Separate lists are displayed for even and odd values.
*/

import java.util.*;
public class Array3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array : ");
		int size = sc.nextInt();
		
		int a[];
		
		a = new int [size];
		System.out.println("Enter a array of elements: ");
		
		for(int i =0; i<size; i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.print("Even Values : " );
		
		for(int i=0; i<size; i++)
		{
				if(a[i]%2==0){
					System.out.print(a[i] + "  " );
				}
		}
		
		System.out.println();
		System.out.print("ODD Values : " );
		for(int j=0; j<size; j++){
				if(a[j]%2==1){
					System.out.print(a[j] + " " );
				}
	}
}

}
