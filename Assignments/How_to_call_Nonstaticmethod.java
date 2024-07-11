package firstpackage;

public class How_to_call_Nonstaticmethod {
	 void addition()
	{
		 int a=10;
		 int b=20;
		 int sum=a+b;
		 
		System.out.println(sum);
		
	}
	 void subtraction()
	 {
		 int a=20;
		 int b=10;
		 int subtraction = a-b;
		System.out.println(subtraction);
		
	}
	public static void main(String[] args) {
		//by creating an object with the help of reff variable 
		//we can call any non static method
		//syntax : classname variable = new classname();
		
		How_to_call_Nonstaticmethod n1=new How_to_call_Nonstaticmethod();
		n1.addition();
		n1.subtraction();
	}

}
