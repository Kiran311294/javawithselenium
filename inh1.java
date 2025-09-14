package Module1.basicjava;

public class inh1 extends inhp{
	
void method4()
{
	System.out.println("m4");
	}
inh1()
{
	this(10);
	System.out.println("Subconstruct");	
}
inh1(int a)
{	
	super();
	System.out.println("Subconstructpara");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inh1 h1= new inh1();
		h1.method1();
		h1.method2();
		h1.method3();
		h1.method4();
		method5();
		
	}

}
