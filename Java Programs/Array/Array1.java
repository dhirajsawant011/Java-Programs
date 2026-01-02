/*
	Q1. Write a Java program to input an array & display it.
	Input:
	Array Size = 5
	Array Elements = 10 20 30 40 50
	Output:
	10 20 30 40 50


*/
import java.util.*;
public class Array1
{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[];
		
		a = new int [size];
		System.out.println("Enter a array Element");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}