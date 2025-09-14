package Module1.basicjava;

public class Assig18 {
	static void method1()
	{
		System.out.println("Method 1");
	}
	static void method1(String name)
	{
		System.out.println("Student name is " +name);
	}
	static void method1(int age)
	{
		System.out.println("Student age is " +age);
	}
	static void method1(int batch, int time)
	{
		System.out.println("Student batch and tine is " +batch+ " " +time);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method1("KiranAuti");
		method1(31);
		method1(58, 7);

	}

}
