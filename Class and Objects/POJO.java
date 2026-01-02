class Employee
{
	private String  name;
	private int id;
	private String address;
	
	void setName(String name )
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	
	void setId(int id )
	{
		this.id = id;
	}
	int getId()
	{
		return id;
	}
	
	void setaddress(String address )
	{
		this.address = address;
	}
	
	String getaddress()
	{
		return address;
	}
}

class Company
{
	Employee emp = new Employee();
	
	void addnewEmployee(Employee emp)
	{
		this.emp = emp;
	}
	
	void showData()
	{
		String name = emp.getName();
		int id = emp.getId();
		String address = emp.getaddress();
		
		System.out.println(name + "\t" + id + " \t" +address);
	}
}

public class POJO
{
	public static void main(String x[])
	{
		Company c = new Company();
		Employee e = new Employee();
		
		e.setId(1);
		e.setName("Dhiraj");
		e.setaddress("Pune");
		
		c.addnewEmployee(e);
		c.showData();
	}
}