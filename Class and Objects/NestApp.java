
class P
{
	void display()
	{
		System.out.println("Outer class : ");
		
		class C 
		{
			void data()
			{
				System.out.println("I am a Member : ");
			}
		}
		
		C p1 = new C();
		p.data();
	}
	 class A
	{
		void show()
		{
			System.out.println("Inner class : ");
		}
	}
	
	static class B
	{
		void showdata()
		{
			System.out.println("Static method : ");
		}
	}
	
	
}

public class NestApp
{	
	public static void main(String x[])
	{
		P p= new P();
		p.display();
		
		
		
		P.A a =p.new A();
		a.show();
		
		P.B n = new P.B();
		n.showdata();
	}
}

