

import java.util.*;

public class Recursion
{
	public static int sum(int n)
	{
		if(n<=1){
			return n;
		
		}else{
			return n+sum(n-2);
		}
}
	public static void main(String x[])
	{
	
		int result = sum(5);
		System.out.print(result);
	}
}

/*
public class RecAPP
{
    public static int sum(int n)
	{
	    if(n<=1)
		{ return n;//show(0)
		}
		else{
		  return n+sum(n-1);
		}
	}
    public static void main(String x[])
	{
	     int result = sum(5);  
		 System.out.println("Result is "+result);
	}
}
*/
