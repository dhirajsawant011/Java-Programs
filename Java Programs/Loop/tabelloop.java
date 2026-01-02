import java.util.*;
public class tabelloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print table: ");
		int no, i,tab;
		no =sc.nextInt();
		i=1;
		while(i<=10)
		{
			tab = no*i;
			System.out.println(tab);
			i++;
		}
	}
}