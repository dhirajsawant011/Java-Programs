
class Vaibhav_dev{
	public static void main(String [] args){
		int a [] = {-5, -2, 5, -2, 4, -7, -1, -8, 0, -8};
		
		int pos [] = new int[a.length];
		int neg [] = new int[a.length];
		
		int posSize = 0;
		int negSize = 0;
		for(int i=0; i<a.length; i++){
			if(a[i]>=0){
				pos[posSize++] = a[i];
			}else{
				neg[negSize++] = a[i];
			}
		}
		
		System.out.println("Positives : ");
		
		for(int i=0; i<posSize; i++)
			System.out.print(pos[i] + " ");
		
		
		System.out.println("\n\nNegatives : ");

		for(int i=0; i<negSize; i++)
			System.out.print(neg[i] + " ");
		
		int p = 0;
		int n = 0;
		
		int i=0;
		for(; i<a.length; i++){
			if(i%2==0){
				if(p < posSize)
					a[i] = pos[p++];
				else
					break;
			}else{
				if(n < negSize)
					a[i] = neg[n++];
				else
					break;
			}
		}
		
		while(p<posSize){
			a[i++] = pos[p++];
		}
		
		while(n<negSize){
			a[i++] = neg[n++];
		}
		
		System.out.println("\n\nResult : ");

		for(i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}
}