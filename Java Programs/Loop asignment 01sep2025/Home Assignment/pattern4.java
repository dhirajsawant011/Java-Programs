//Q1. Write a java program to print this pattern.

//*
//* *
//* * *
//* * * *
//* * * * *

public class pattern4
{
	public static void main(String x[])throws Exception 
	{
		for(int i= 1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i>=j){
				System.out.print(" * "); Thread.sleep(300);
				}
			}
			System.out.println(" "); Thread.sleep(300);
		}
		
	
	}
}
