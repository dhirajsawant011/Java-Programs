/*
Q4.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.

*/
import java.util.*;
public class Array24
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
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(i%2==0)
				{
					if(a[i]%2==1){
						int temp = a[i];
						a[i] =a[j];
						a[j] =temp;
					}
				}else
				{
					if(a[i]%2==0)
					{
						int temp = a[i];
						a[i] =a[j];
						a[j] =temp;
					}
				}
			}
			
		}
		for(int i=0; i<size; i++){
		System.out.print(a[i] +" " );
		}
	}
}