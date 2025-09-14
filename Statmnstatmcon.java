package Module1.basicjava;

public class Statmnstatmcon {
		static void method1(String name)
		{
			System.out.println("your name is " + name);
		}
		static void method2(int age)
		{
			System.out.println("your age is " + age);
		}
		void nsmethod1(int batch)
		{
			System.out.println("your batch is " + batch);
		}
		void nsmethod2(int classtime)
		{
			System.out.println("your classtime is " + classtime);
		}
		Statmnstatmcon()
		{
			System.out.println("Welcomme to JAVA automation batch");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1("Kiran");
		method2(30);
		Statmnstatmcon s1=new Statmnstatmcon();
		s1.nsmethod1(58);
		s1.nsmethod2(78);
	}

}
