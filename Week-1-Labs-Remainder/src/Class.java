
public class Class
{
	public Class()
	{
		System.out.println("Default constructor ran.");
	}
	public Class(int value)
	{
		System.out.println(value);
	}
	
	public static void main(String[] args)
	{
		Class c = new Class(5839);
		
		Class cNoArg = new Class();
	}
}
