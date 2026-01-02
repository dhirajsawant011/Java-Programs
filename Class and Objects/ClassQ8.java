/*
	8. Find Square of a Number
	Create a class SquareFinder with a method square that calculates the square of a number.
	Explanation: Covers single-parameter logic in methods.
*/

import java.util.*;
public class ClassQ8
{
	public static void main(String x[])
	{
		System.out.println("  Find Square of a Number  ");
		SquareFinder sq = new SquareFinder();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int no = sc.nextInt();
		int result = sq.square(no);
		System.out.println(no+" of Square is   : " + result);
	}
} 
class SquareFinder
{
	int square(int n)
	{
		return n*n;
	}
}