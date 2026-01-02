	//Q34. Write a java program to find the frequency of each digit in a given integer.

	import java.util.*;

public class Loop34
{
	public static void main(String x[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number:-  ");
			int no  = sc.nextInt();
			int org = no;
				for(int i=0; i<=9; i++){
					 int temp =org; //192929123
					 int count =0; //0
						while(temp > 0){ 
						int digit = temp%10;  
							if(digit == i){ 
							count++;
							}
						temp = temp/10;
						}
					if(count > 0){
					System.out.println(i + " : " +count);
					}
				}
	}
}
	



