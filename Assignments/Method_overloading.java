package firstpackage;

public class Method_overloading {
	//creating multiple method with the same name but variation in the argument list
	static void add(int a)
	{
		System.out.println("1");
		
	}
	static void add(String a)
	{
		System.out.println("2");
		
	}

	public static void main(String[] args) {

     add(0);
     add(100);
     

	}

}
