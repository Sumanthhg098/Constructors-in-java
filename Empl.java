class Program02
{
	String name;
	int id;
	float salary;
	
	public Program02() 
	{
		
	}
	public Program02(String name, int id) 
	{
		this();
		this.name=name;
		this.id=id;
		salary=53333.33F;
	}
	public Program02(String name, int id, float salary) 
	{
		this("Ravi", 15);
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String getName() 
	{
		return name;
	}
	public int getId() 
	{
		return id;
	}
	public float getSalary()
	{
		return salary;
	}
}
public class Empl 
{
	public static void main(String[] args) 
	{
		Program02 p1 = new Program02();
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		System.out.println(p1.getSalary());
		
		Program02 p2 = new Program02("Ravi", 22);
		System.out.println(p2.getName());
		System.out.println(p2.getId());
		System.out.println(p2.getSalary());
		
		Program02 p3 = new Program02("Raju", 33, 33333.33F);
		System.out.println(p3.getName());
		System.out.println(p3.getId());
		System.out.println(p3.getSalary());

	}

}
