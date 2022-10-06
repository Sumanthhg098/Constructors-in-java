class Student
{
	String name, location;
	int rollNo, fee, std;
	
	public Student() 
	{
		
	}
	public Student(String name, int rollNo)
	{
		this();
		this.name=name;
		this.rollNo=rollNo;
		std=4;
		fee=40000;
		location="davangere";
	}
	public Student(String name, int rollNo, int std)
	{
		this("Sudha",145);
		this.name=name;
		this.rollNo=rollNo;
		this.std=std;
		fee=33500;
		location="Bang";
	}
	public Student(String name, int rollNo,int std,int fee)
	{
		this("Sanju",145,6);
		this.name=name;
		this.rollNo=rollNo;
		this.std=std;
		this.fee=fee;
		location="smg";
	}
	public Student(String name, int rollNo,int std,int fee,String location)
	{
		this("Sanju",145,6);
		this.name=name;
		this.rollNo=rollNo;
		this.std=std;
		this.fee=fee;
		this.location=location;
	}
	public String getName() 
	{
		return name;
	}
	public int getRollNo() 
	{
		return rollNo;
	}
	public int getStd() 
	{
		return std;
	}
	public int getFee() 
	{
		return fee;
	}
	public String getLocation() 
	{
		return location;
	}
}
public class StudentApp 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println("["+s1.getName()+" "+s1.getRollNo()+" "+s1.getStd()+" "+
		s1.getFee()+" "+s1.getLocation()+"]");
		
		Student s2 = new Student("Sumanth", 98);
		System.out.println("["+s2.getName()+" "+s2.getRollNo()+" "+s2.getStd()+" "+
		s2.getFee()+" "+s2.getLocation()+"]");
		
		Student s3 = new Student("Surya", 99, 8);
		System.out.println("["+s3.getName()+" "+s3.getRollNo()+" "+s3.getStd()+" "+
		s3.getFee()+" "+s3.getLocation()+"]");
		
		Student s4 = new Student("Suraj", 69, 9, 69696);
		System.out.println("["+s4.getName()+" "+s4.getRollNo()+" "+s4.getStd()+" "+
		s4.getFee()+" "+s4.getLocation()+"]");
		
		Student s5 = new Student("Sanju", 74, 10, 33333, "Davangere");
		System.out.println("["+s5.getName()+" "+s5.getRollNo()+" "+s5.getStd()+" "+
		s5.getFee()+" "+s5.getLocation()+"]");

	}

}
