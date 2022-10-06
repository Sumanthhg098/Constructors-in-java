class Program
{
	int x,y;
	public Program() 
	{
		
	}
	public Program(int x, int y) 
	{
		this();
		this.x=x;
		this.y=y;
	}
	public int getX() 
	{
		return x;
	}
	public int getY() 
	{
		return y;
	}
}
public class Program01 
{

	public static void main(String[] args) 
	{
		Program p1 = new Program(10, 20);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		Program p2 = new Program();
		System.out.println(p2.getX());
		System.out.println(p2.getY());

	}

}
