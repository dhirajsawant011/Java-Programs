
class Value
{
	int x,y;
	void setValues(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Add extends Value
{
	int getValue()
	{
		return x+y;
	}
}
class Mul extends Value
{
	int getValue()
	{
		return x*y;
	}
}
public class stat1
{
	public static void main(String x[])
	{	
		int res; 
		Add ad = new Add();
		ad.setValues(10,20);
		res = ad.getValue();
		System.out.println(res);
		
		Mul m = new Mul();
		m.setValues(2,3);
		res = m.getValue();
		System.out.println(res);
	}
}