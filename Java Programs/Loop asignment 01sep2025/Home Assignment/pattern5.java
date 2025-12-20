//Q2. Write a java program to print this pattern.

//*****
//****
//***
//**
//*

public class pattern5
{
	public static void main(String x[])
	{
		for(int i= 1; i<=5; i++){
			for(int j=5; j>=1; j--){
				if(i<=j){
				System.out.print(" * ");
				}
			}
			System.out.println(" ");
		}
		
	
	}
}
