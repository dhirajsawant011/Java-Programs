//Q15. Write a java program to print all ASCII characters with their values.


public class Loop15
{
	public static void main(String x[])
	{
		int i=0;
		while(i<256){
			System.out.println(i + " : " + (char)i);
			i++;
		}
	}
}
  // ASCII value of 'A' is 65
