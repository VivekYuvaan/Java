package firstpackage;

public class How_to_call_staticmethod {

	static void addition()
	{
		System.out.println("addition Method");
		
	}
	static void subtraction()
	{
		System.out.println("subtraction Method");
		
	}
	public static void main(String[] args)
	{

	System.out.println("main method");
	addition();   //you can always call static method by name 
	subtraction();
	

	}

}
