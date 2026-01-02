import java.util.*;

public class calpower
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int base, index,i,p=1;
		System.out.print("Enter a base number:-");
		base  =sc.nextInt();
		System.out.print("Enter a index number:-");
		index =sc.nextInt();
		i=1;
		while(i<=index) // 1) 1<=3/  2)2<=3/  3)/3<=3/   4)(4<=4==false)
		{
			p=p*base; p= //1) 1*5 = 5/   2)5*5 = 25/   3)25*5 =125
			i++;
			
		}
		System.out.println("power is "+p);
	}
}

