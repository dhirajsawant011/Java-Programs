class Vaibhav{
	public static void main(String [] args){
		int range = sc.nextInt;
		
		for(int i=1; i<=range; i++){
			
			//checking one by one number in the given range if it's strong or not
			int n = i;

			int sum = 0;
			while(n>0){
				int digit = n % 10;
				
				//calculating factorial of the digit
				int fact = 1;
				for(int j=1; j<=digit; j++){
					fact = fact * j;
				}
				
				//adding factorial of the digit in the sum
				sum = sum + fact;
				n = n / 10;
			}
			
			if(sum == i)
				System.out.println(i);
		}
	}
}