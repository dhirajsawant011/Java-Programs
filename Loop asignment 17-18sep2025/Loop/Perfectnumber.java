import java.util.*;
public class Perfectnumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no,sum =0,i;
		System.out.printf("Enter a number : ");
		no=sc.nextInt();
		i=1;
		while(i<no)
		{
			if(no%i==0)
			{
				sum = sum+i;	
			}
			i++;
		}
		String msg = no==sum ? "number is perfect":"number is not perfect";	
		System.out.println(msg);
	}
	
}