/*
	Q10. Create a Product class with:
	productName
	stock
	Use a constructor to set values.
	Create an array of 15 products.
	Write a method to count how many products have stock < 10.
	Concepts Used:
	✔ Constructor
	✔ Array of objects
	✔ Logical condition (stock < 10)
	✔ Counter variable
*/
import java.util.*;
class Product
{
	String productName;
	int stock;
	Product(String productName, int stock)
	{
		this.productName = productName;
		this.stock = stock;
	}
	int countStock(int count)
	{
		if(stock<10)
		{
			count++;
		}
		return count;
	}
}

public class ConstructorQ10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Product p[] = new Product[3];
		System.out.println("Enter Details about Stock ");
		for(int i=0; i<p.length; i++)
		{
			System.out.print("Enter your Product name : ");
			String pname= sc.nextLine();
			
			System.out.print("Enter how much stock in : ");
			int stock = sc.nextInt();
			sc.nextLine();
			
			p[i] = new Product(pname,stock);
		}
		int count=0;
		for(int i=0; i<p.length; i++)
		{
			count = p[i].countStock(count);
		}
		
		System.out.println("");
		System.out.println(count + " products have stock less than 10" );
	}
}	