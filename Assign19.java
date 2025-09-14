package Module1.basicjava;

public class Assign19 extends Assign19parent{

	Assign19()
	{
		super (10);
		System.out.println("child constructor");
	}
	Assign19(int a)
	{
		this(10,19);
		System.out.println("child constructor this call");
	}
	Assign19(int a, int b)
	{
		System.out.println("child constructor this call1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign19 a19  = new Assign19();
		new Assign19(10);
	}

}
