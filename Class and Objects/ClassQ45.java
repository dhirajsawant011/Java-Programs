/*
Q14. Given two arrays, our task is to find their common elements. 
Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”],
        Array2 = [“b”, “d”, “e”, “h”, “g”, “c”],
Output: [b, c, d, e]
Your Task 
_______________________________________________________
You have to create class names s FindCommonElements with following methods 
void setArray(int a[],int b[]); this function can accept two array as parameter 
Int [] getCommonElements(): you have to create a new third array and find the common element and
return it.

*/

import java.util.*;
public class ClassQ45
{
	public static void main(String []args)
	{
		char x[] = {'a','b','c','d','e','f'};
		char y[] = {'b','d','e','h','g','c'};
		
		FindCommonElements fc = new FindCommonElements();
		
		fc.setArray(x,y);
		char result [] = fc.getCommonElements();
		
		//System.out.print("[");
		for(int i=0; i<result.length; i++)
		{
				System.out.print(result[i] +" ");
		}
		//System.out.print("]");
	}
}

class FindCommonElements
{
	char a[], b[];
	void setArray(char x[], char y[])
    {
        a = x;
        b = y;
    }
	
	char [] getCommonElements()
	{
		int k=0;
		char c[] = new char[a.length+b.length];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				//if(a[i] == b[i])
				if(a[i] == b[j])  
				{
					c[k++]= a[i];
					
				}
			}
		}
		return c;
		
	}
}


