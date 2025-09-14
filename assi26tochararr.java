package Module1.basicjava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class assi26tochararr {

	public static void main(String[] args) {
		Scanner ass26=new Scanner(System.in);
		String name=ass26.next();
		 System.out.println(name);
		 char[] a=name.toCharArray();
		 for(int i=0;i<name.length();i++)
         {
         System.out.println(a[i]);

         }
         
         System.out.println(Arrays.toString(a));

	}

}
