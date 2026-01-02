/*
	Q2. Create a Product class having fields productName and price.
	Initialize using a constructor.
	Write a method isDiscountEligible() that returns true if price > 500, else false.
	In main, print which products get discount.
	Concepts Used:
	✔ Constructor to set values
	✔ Logical operator (>)
	✔ Returning boolean
	Explanation:
	Constructor loads product values; logical check decides discount eligibility.
*/

class Product
{
	String productName;
	int price;
	Product(String productName, int price)
	{
		this.productName = productName;
		this.price = price;
	}
	
	 boolean isDiscountEligible()
	 {
		if(price>500)
		{
			return true;
		}else{
			return false;
		}
	 }
}

public class ConstructorQ2
{
	public static void main(String x[])
	{
		boolean result;
		Product p = new Product("Mobile cover" , 420);
		result=p.isDiscountEligible();
		System.out.println(result);
		
		Product p1 = new Product("Biscuits" , 520);
		result=p1.isDiscountEligible();
		System.out.println(result);
		
		Product p2 = new Product("Case " , 620);
		result=p2.isDiscountEligible();
		System.out.println(result);
		
	}
}