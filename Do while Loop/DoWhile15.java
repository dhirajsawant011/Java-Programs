/*
Q15. Write a java program to print all ASCII characters with their values.
*/

public class DoWhile15
{
	public static void main(String x[])
	{
		char ch =1;
		do{
			System.out.println((int)ch+" : " +ch);
			ch++;
		}while(ch<=256);
		
	}
}