/*
	Q5.Create a Box class with fields length, width, height.
	Initialize them with a constructor.
	Write a method isValidVolume() that checks volume:
	If volume > 0 → Print “Valid box”
	Else → Print “Invalid dimensions”
	Concepts Used:
	✔ Constructor
	✔ Logical condition (volume > 0)
	✔ Multiplication operation
	Explanation:
	A box is valid only if all dimensions are positive, so the volume remains > 0.
*/

class Box
{
	int length,width,height;
	int Volume;
	Box(int length, int width, int height)
	{
		this.length = length;
		this.width  = width;
		this.height = height;
	}
	void Multiplication()
	{
		Volume= length*width*height;
	}
	void isValidVolume()
	{
		if(Volume>0)
		{
			System.out.println("Valid box");
		}
		else
		{
			System.out.println("Invalid box");
		}
	}
}
class ConstructorQ5
{
	public static void main(String x[])
	{
		Box b = new Box(12,4,14);
		b.Multiplication();
		b.isValidVolume();
		
		
	}
} 