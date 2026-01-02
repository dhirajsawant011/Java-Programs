class WeirdPattern{
	public static void main(String [] args){
		for(int i=1; i<=5; i++){
			int m = 1, k = 1;;
			for(int j=1; j<=9; j++){
				if(j>10-2*i){
					int x = m++ < i ? k++ : k--;
					if( i % 2 == 0)
						System.out.print(x + " ");
					else
						System.out.print((char)(64+ x)+ " ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
}