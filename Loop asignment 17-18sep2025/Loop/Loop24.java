//Q24. Write a java program to Check Number Is Strong Number or Not.

//Example with source code
import java.util.*;

public class Loop24
{  public static void main(String x[])
   {
      Scanner xyz = new Scanner(System.in);
      int no,rem,f,sum=0,temp;	
      System.out.println("Enter number");
      no=xyz.nextInt();
	  temp=no;
      for(;no!=0;)
      {
		rem  = no % 10;
		  f=1;
		 for(;rem!=0;)
		 { f=f*rem;
	        --rem;
		 }
		 sum=sum+f;
		 no=no/10;
	  }		  
	  String msg=temp == sum ? "Strong ": "Not Strong";
	  System.out.println(msg);
   }
}

