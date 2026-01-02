import java.util.*;

public class Switchcase
{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			int choice,a,b;
			System.out.println("1:Addition");
			System.out.println("2:Multiplication");
			System.out.println("Enter two values");
			a=sc.nextInt();//10
			b=sc.nextInt(); //20
			System.out.println("Enter your choice");
			choice=sc.nextInt(); //2
			
			switch(choice)
			{
				case 1:
					System.out.println("Addition "+(a+b));
					break;
				case 2:
					System.out.println("Multiplication "+(a*b));
					break;
				default :
					System.out.println("wrong choice");
			}	


		}
}