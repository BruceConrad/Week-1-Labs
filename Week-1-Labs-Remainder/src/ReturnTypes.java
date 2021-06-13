
public class ReturnTypes
{
	public static void main(String[] args)
	{
		ReturnTypes rt = new ReturnTypes();
		
		rt.returnNothing();
		
		boolean b = rt.returnBoolean();
	}
	
	public void returnNothing()
	{
		System.out.println("Inside of a void method");
	}
	
	public boolean returnBoolean()
	{
		return true;
	}
}
