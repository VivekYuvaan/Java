package firstpackage;

public class Call_both_Methods {
	static void addition()
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
		// TODO Auto-generated method stub
		addition();
		Call_both_Methods b1 = new Call_both_Methods();
		b1.subtraction();

	}

}
