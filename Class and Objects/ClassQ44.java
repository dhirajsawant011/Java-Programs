/*
	Q13. WAP to create class name as Search with two functions 
	boolean isPresent(int  key,int …value): this function can search the key present in an
	array or not if present returns true otherwise return false.
*/

import java.util.*;
public class ClassQ44

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//int key = 
		Search fc = new Search();
		boolean result = fc.isPresent(8,5,1,4,6,8);
		System.out.println(result);
	}
}
class Search
{
	boolean isPresent(int  key,int ...value) 
	{	
		for(int i=0; i<value.length; i++)
		{
			if(value[i]==key)
			{
				return true;
			}
		}
		return false;
	}	
		
}