/*
	Q9. WAP to create class name as FiboFiboFibo with two functions 
	void setLimit(int limit): this function is used for set the limit for fibonacci series 
	void checkFibo(): this function can print the fibonacci series 
*/


import java.util.*;
public class ClassQ40
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int no = sc.nextInt();
		
		Fibo fc = new Fibo();
		fc.setLimit(no);
		fc.checkFibo();
	}
}
class Fibo
{
	int num;
	void setLimit(int limit)
	{
		num =limit;
	}
	void checkFibo()
	{
		 int a=0; 
		 int b=1;
		 System.out.println("fibonacci series  : ");
		 for(int i = 1; i <= num; i++)
        {
            System.out.print(a + " ");//0 //1 //1 //2 //
            b = a + b;   //0+1	 //1+1 =2 //2+1=3 
            a = b - a;	 //1-0=1 //2-1 =1 //3-1=2
        }
	}
}