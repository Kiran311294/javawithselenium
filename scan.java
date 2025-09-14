package Module1.basicjava;

import java.util.Scanner;

public class scan {
	static void square(int a)
	{
		double square= Math.PI*a*a;
		System.out.println(square);
	}
	static void confS(int a)
	{
		int circum= a*4;
		System.out.println(circum);
	}
	static void triA(int b)
	{
		int tri= b*b;
		System.out.println(tri);
	}
	static void confT(int b)
	{
		int tri1= b*4;
		System.out.println(tri1);
	}
	static void recA(int l, int b1)
	{
		int rec= l*b1;
		System.out.println(rec);
	}
	static void recC(int l, int b1)
	{
		int recCa= 2*(l+b1);
		System.out.println(recCa);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		//double pi= sc.nextDouble();
		scan cs= new scan();
		cs.square(a);
		cs.confS(a);
		int b=sc.nextInt();
		cs.triA(b);
		cs.confT(b);
		int l=sc.nextInt();
		int b1=sc.nextInt();
		
		cs.recA(l, b1);
		cs.recC(l, b1);
		sc.close();
	
	}

}
