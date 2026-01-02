/*
		Loop through array, apply condition, increment count.
	Q11. Create a class Product with:
	Fields: productId, name, price, category
	Constructors:

	Default constructor (assign temporary values)
	Parameterized constructor (assign all fields)
	Task Logic:
	Write a method getFinalPrice() that applies:
	
	if category = "Electronics" → 18% GST + 10% discount
	if category = "Clothing" → 5% GST + 20% discount
	otherwise → only 5% GST
	
	Create 3 objects using all three constructors and find the final price for each.
	Expected Learning: Constructor chaining + conditional logic.
	
*/

class Product
{
	int productId;
	double price;
	String name, category;
	Product(int productId, String name, double price,String category)
	{
		this.productId= productId;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	double getFinalPrice()
	{
		double gst=0, discount=0;
		if(category.equals( "Electronics" ))
		{
			//18% GST + 10% discount;
			gst = price * 18/100.0;
			discount = price * 10/100.0;
		}
		else if(category.equals("Clothing"))
		{
			//5% GST + 20% discount
			gst =price *  5/100.0;
			discount =price *  20/100.0;
		}
		else
		{
			//only 5% GST
			gst =price * 5/100.0;
		}
		return price + gst - discount;
	}
	
}

public class ConstructorQ11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Product pd[] = new Product(1,"Dhiraj" , 20000, "Electronics");
		
		for(int i=0; i<pd.length; i++)
		{
			System.out.println("Enter a ProductId : ");
			int id = sc.nextInt();
			
			
			System.out.println("Enter a Product Name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter a Product Price : ");
			int price = sc.nextInt();
			
			System.out.println("Enter a Product Category : ");	
			
			
		}
		
		for(int i=0; i<pd.legth; i++)
		{
		
			
		}
		System.out.println("Final price " + pd.getFinalPrice());
	}
}