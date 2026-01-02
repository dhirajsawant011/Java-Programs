import java.util.*;
public class PTemp
{   public static void main(String x[])
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of Array : ");
		int size = sc.nextInt();
		int a [] = new int[size];
		
		System.out.println("Enter first array element : ");
		for(int i=0; i<size; i++)
		{ a[i] = sc.nextInt();
		}
		
		System.out.print("Enter a size of Array : ");
		int size1 = sc.nextInt();
		int b [] = new int[size1];
		System.out.println("Enter second array element : ");
		for(int i=0; i<size1; i++)
		{ b[i] = sc.nextInt();
		}
		
		System.out.print("Array first Elements  : ");
		for(int i=0 ; i<size; i++){
			System.out.print(a[i] +" ");
		}
		
		System.out.println();
		System.out.print("Array Second Elements : ");
		for(int i=0 ; i<size1; i++)
		{ System.out.print(b[i] +" ");
		}
		
		if(size != size1){
			System.out.print("Not anagram ");
		}
		Arrays.sort(a);
		Arrays.sort(b);
		boolean isAnagram = true;
		for(int i=0; i<size; i++)
		{if(a[i]!=b[i]){	
				isAnagram = false;
				break;
			}
		}
		System.out.println();
		System.out.print("Result : ");
		System.out.print(isAnagram?"Anamgram":"Not Anagram");
	}
}                                                       