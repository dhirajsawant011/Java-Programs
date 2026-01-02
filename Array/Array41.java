/*
Q5. Write a java program to take input array from user and perform all operations in array.
Input Array :  	X
	
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 
				
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321
				
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11
	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135
				
Case 5 : Store only prime number at the same index of digit.
		Output :- 2573  5  253  25  357  235
*/
import java.util.Scanner;

class Array41{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size a of array : ");
		int size = sc.nextInt();
		int a [] = new int[size];
		
		System.out.println("Enter a array element : ");
		for(int i=0; i<size; i++)
		{
			a[i]= sc.nextInt();
		}
	
		System.out.print("Given array : ");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i ]+ " ");
		}
		while(true){
			System.out.print("\nEnter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 0: return;
	
				case 1:
					System.out.println("Sort Number In Ascending Order.");
					for(int x = 0; x < a.length; x++){
						int n = a[x];
			
						int sorted = 0;			//35677
						for(int i = 1; i<=9; i++){		//10
							//56737
							while(n > 0){
								if(n % 10 == i){
									sorted = sorted * 10 + i;
								}
							
								n = n / 10;
							}
							
							n = a[x];
						}
						
						a[x] = sorted;
					}
					
					for(int i=0; i<a.length; i++)
						System.out.print(a[i] + " ");
					break;
					
				case 2:
					System.out.println("Sort Number In Descending Order. ");
					for(int x = 0; x < a.length; x++){
						int n = a[x];
			
						int sorted = 0;			//35677
						for(int i = 9; i>=0; i--){		//10
							//56737
							while(n > 0){
								if(n % 10 == i){
									sorted = sorted * 10 + i;
								}
							
								n = n / 10;
							}
							
							n = a[x];
						}
						
						a[x] = sorted;
					}
					for(int i =0; i<a.length; i++)
					{
					System.out.print(a[i] + " ");
					}
					break;
					
			case 3:
				System.out.println("Store sum of digits at same index. ");	
				//int b[] = new int[a.length];
				//int ptr=0;
				
				for(int i=0; i<a.length; i++)
				{
					int n = a[i];
					int sum = 0;
					while(n > 0)
					{
						int digit = n%10;//5732 //2
						sum = sum+digit;
						n=n/10;
					}
					a[i] = sum;
					//ptr++;
				}
				for(int i=0; i<a.length; i++)
				{
					System.out.print(a[i] + " ");
				}
				break;
				
			case 4:
				
				System.out.println("Store the even number at the first and odd number at the last of digit at same index.");
				for(int i=0; i<a.length; i++)
				{
					int n = a[i];
					int even = 0;		//35677
					int odd = 0;
					int acc = 1;
					while(n > 0){
					int digit = n % 10;
					if(digit % 2 == 0)
					{
					even = even * 10 + digit;
					}else
					{
					odd = odd * 10 + digit;
					acc = acc * 10;
					}
					n = n / 10;
					}
		
					int evenOdd = even * acc + odd;
		
					a[i] = evenOdd;
					
				}
				for(int i=0; i<a.length; i++)
				{
					System.out.print(a[i] + " ");
				}
				break;
				
			case 5:
				System.out.println("Store only prime digits at same index:");
                    for (int i = 0; i < a.length; i++) {
                        int n = a[i];
                        int result = 0;
                        int power = 1;
                        while (n > 0) {
                            int d = n % 10;
                            if (d == 2 || d == 3 || d == 5 || d == 7) {
                                result = result + d * power;
                                power *= 10;
                            }
                            n /= 10;
                        }
                        a[i] = result;
                    }
                    for (int i = 0; i < a.length; i++)
                        System.out.print(a[i] + " ");
                break;
				
				default:
					System.out.print("Invalid Choice ");
			}
		}
	}
}
