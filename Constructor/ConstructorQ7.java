/*
	Q7. Create a Car class with:
	brand
	mileage
	Use a constructor to set values.
	Write a method getMileageRating():
	mileage < 10 → “Poor”
	10 to 15 → “Average”
	15 to 20 → “Good”
	20 → “Excellent”
	Explanation:
	Use nested if-else or else-if ladder inside a class method.
*/

class Car
{
	String brand;
	int mileage;
	Car(String brand, int mileage)
	{
		this.brand = brand;
		this.mileage= mileage;
	}
	
	void getMileageRating()
	{
		if(mileage < 10)
		{
			System.out.println("Poor");
		}
		else if(mileage >10 && mileage<15)
		{
			System.out.println("Average");
		}
		else if(mileage >15 && mileage<20)
		{
			System.out.println("Good");
		}
		else if(mileage<=20)
		{
			System.out.println("Excellent");
		}
		else
		{
			System.out.println("Invalid syntax");
		}
	}
}

public class ConstructorQ7
{
	public static void main(String x[])
	{
		Car c = new Car("Honda Unicorn",20);
		c.getMileageRating();
	}
}