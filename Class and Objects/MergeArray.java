

public class MergeArray
{
	public static void main(String x[])
	{
		int a[] = {3,7,8,11};
		int b[] = {2,5,6};
		
		int c[] = new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i] = a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i] = b[i];
		}
		//System.out.println(c.length);
		for(int i=0; i<c.length-1; i++)
		{
			for(int j=0; j<c.length-1-i; j++)
			{
				if(c[j] > c[j+1])
				{
					int temp =c[j];
					c[j] =c[j+1];
					c[j+1] =temp;
				}
			}
		}
		for(int i=0; i<c.length; i++)
		{ 
			System.out.print(c[i] + " ");
		}
	}

}