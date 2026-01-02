
import java.util.*;
class initArray
{
	int a[];
	
	initArray(int a[])
	{
		this.a = a;
	}
	
	int getMax()
	{
		int max = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}
	
	int [] sortedArray()
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
				}
			}
		}
		return a;
	}
}

public class ConParApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("Enter a Array Elements  : ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Given Array : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		initArray AI = new initArray(a);
		
		
		int max = AI.getMax();
		System.out.println("Max is " + max);
		
		int re[] = AI.sortedArray();
		
		System.out.println("Sorted Array : ");
		for(int i=0; i<re.length; i++)
		{
			System.out.print(re[i] + " ");
		}
		
	}
}