public class ObjARAPP
{
	public static void main(String x[])
	{
		Object obj[] = new Object[5];
		obj[0] = false;
		obj[1] = "Good";
		obj[2] = new java.util.Date();
		obj[3] =5.4f;
		obj[4]= 100L;
		
		for(int i=0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}
	}
}