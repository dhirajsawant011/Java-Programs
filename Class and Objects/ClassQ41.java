/*
	Q10. WAP to create class name as FindMax with two functions 
	void setValue(int …x): this function accept infinite parameter from calling
	int  getMax(): this function can find the value from the function and return it.
*/


import java.util.*;
public class ClassQ41

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		FindMax fc = new FindMax();
		fc.setValue(100,10,20,30,40,50,200);
		int result = fc.getMax();
		System.out.println("max  is " + result);
	}
}
class FindMax
{
	int num[];
	void setValue(int ...x)
	{
			num = x;
	}
	int getMax()
	{	
		int max = num[0];
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max = num[i];
			}
		}
		return max;
	}
}