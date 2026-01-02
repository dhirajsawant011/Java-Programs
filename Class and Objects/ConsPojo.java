import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
	
	void setId(int id)
	{
		this.id= id;
	}
	
	int getId()
	{
		return id;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	
	void setSal(int sal)
	{
		this.sal = sal;
	}
	
	int getSal()
	{
		return sal;
	}
}

class Company
{
	Employee emp[];
	Company(Employee emp[])
	{
		this.emp = emp;
	}
	
	void show()
	{
		for(int i=0; i<emp.length; i++)
		{
			System.out.println(emp[i].getId() + "  " +emp[i].getName() +"  " + "  "+ emp[i].getSal() +"  ");
		}
	}
	
}

public class ConsPojo
{
	public static void main(String x[])
	{
		Employee emp[] = new Employee[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			int id=sc.nextInt();
			emp[i].setId(id);
			sc.nextLine();
			String name=sc.nextLine();
			emp[i].setName(name);
			int sal=sc.nextInt();
			emp[i].setSal(sal);
		}
		
		Company cm = new Company(emp);
		cm.show();
		
	}
}