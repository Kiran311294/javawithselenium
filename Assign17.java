package Module1.basicjava;

public class Assign17 {
	Assign17(int a)
	{
		System.out.println("The no is "+a);
	}
	Assign17(int a, int b)
	{
		int c=a+b;
		System.out.println("The added no is "+c);
	}
	Assign17(int a, int b, int d)
	{
		int c=a*b*d;
		System.out.println("The mul of no is "+c);
	}
	public static void main(String[] args) {
		Assign17 as= new Assign17(2);
		new Assign17(12,34);
		new Assign17(12,34,67);
	}

}
