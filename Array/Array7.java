/*
Q2. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.

*/
import java.util.*;
public class Array7
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int a[];
		a = new int[size];
		int temp, end,mid;
		System.out.println("Enter a array Element : ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		mid = size/2;
		System.out.println(mid + " ");
		end = size-1;
		System.out.println(end + " ");
					 //2<2 // false
		for(int i=0; i<mid; i++)
		{
			temp = a[i];  //1 //2
			a[i] =a[end]; //5 //4
			a[end] = temp;//1 //2
			end--; //3 //2
		}
		//a[0] =5 //a[4] =1 //a[1] =2 //a[2] =4
        //5       1
		//  4   2
		//    3
		//0 1 2 3 4 
		//1 2 3 4 5 
		//5 4 3 2 1
 		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}