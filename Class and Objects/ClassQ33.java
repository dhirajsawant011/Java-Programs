/*

	Q2. WAP to create class name as Power with function 
	void setNum(): this function accept two values first is base and second is index 
	void showPower(): this function can calculate the power of two numbers and display it.	
*/
import java.util.*;
public class ClassQ33
{
	public static void main(String x[])
	{
		
		
		power pw = new power();
		pw.setNum();
		pw.showPower();
	}
}

class power
{
	Scanner sc = new Scanner(System.in);
	int base,index;
	void setNum()
	{
		System.out.print("Enter a base value : ");
		base = sc.nextInt();
		System.out.print("Enter a Index value : ");
		index = sc.nextInt();	
	}
	void showPower()
	{
		int pow=1;
		for(int i=1; i<=index; i++)
		{
			pow = pow*base;
		}
		System.out.println("Power is " + pow);
		
	}
}