import java.util.Scanner;

class Vaibhav{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();	//8659    6859
		int org = n;
		int even = 0;		//35677
		int odd = 0;
		int acc = 1;
		while(n > 0){
			int digit = n % 10;
			if(digit % 2 == 0){
				even = even * 10 + digit;
			}else{
				odd = odd * 10 + digit;
				acc = acc * 10;
			}
			
			n = n / 10;
		}
		
		int evenOdd = even * acc + odd;
		
		System.out.println(evenOdd);
		
	}
}