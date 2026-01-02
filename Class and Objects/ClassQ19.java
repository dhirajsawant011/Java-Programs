/*
	19. Find GCD of Two Numbers
	Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
	Explanation: Introduces loops and mathematical relationships.
*/
import java.util.*;
public class ClassQ19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter First number  : ");
		int a = sc.nextInt();
		
		System.out.print("enter second number  : ");
		int b= sc.nextInt();
		GCDCalculator pc  = new GCDCalculator();
		int  result  = pc.findGCD(a,b);
		System.out.println("Common divisor is "+ result);
	}
}

class GCDCalculator
{
	int findGCD(int a ,int b)
	{			//12 18
		while(b != 0) //18!=0 //6!=0 0!=0
        {
            int temp = b; //18		 //6
            b = a % b;	 // 12%18 =6 //18%6=0 
            a = temp;	//18		 //18
        }
        return a;
    }
}