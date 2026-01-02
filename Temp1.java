/*
Q21.  Write a java program to check Number Is Prime Number or Not.


	*/
import java.util.*;

public class Temp1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int no = sc.nextInt();
		
		boolean isPrime = true;
		//if(no<=1){	5<=1
		//	isPrime=false; //why is isprimme because 1 is not prime number and condition false
		//}else{
			
				int i =2;
				while(i<=no/2){ //2<= 5/2 = 2 true 3<= 5/2 = 2 //4< 5/2 =2 5<= 5/2 =2
					if(no%i==0){//5%2==0 =1 false //5%5==0 =0 true
						isPrime =false; 
						break;
					}
					i++;
					
				}
			
		////
		
		System.out.println(isPrime? "prime":"not prime");
		
	}
}

				if(i==0 || j==0){
						c=1;
						System.out.print(c+ "  ");
					}else{
						c=c*(i-j+1)/j;
						System.out.print(c+ "  ");
					}

