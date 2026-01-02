import java.util.*;
class Circle
{
	float pi;
	Circle()
	{
		pi = 3.14f;
		System.out.println("I am a constructor");
	}
	int getCube(int a)
	{
		return a*a*a;
	}
	
	double GetArea (int r)
	{
		return Math.PI*r*r;
	}
}

public class CircleApp
{
	public static void main(String x[])
	{
		Circle c = new Circle();
		
		float re = c.GetArea(5);
		System.out.println("Area is = "+re);
		
		System.out.println("Cube is =" + c.getCube(5));
	}
}