

class Cube 
{
	int n;
	Cube(int n)
	{
		this.n = n;
	}
	
	int getCube()
	{
		return	 n*n*n;
	}
}

public class fiboApp
{
	public static void main(String x[])
	{
		//Cube cb = new Cube(5);
		
		//cb.Cube(5);// this using error constructor Cube in class Cube cannot be applied to given types;
		
		//int result =cb.getCube();
		int result =new Cube(5).getCube();
		System.out.println("Cube is " +result);
	}
}

