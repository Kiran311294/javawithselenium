package Module1.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class Assig27userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i = sc.nextInt();
		int size[]=new int[i];
		System.out.println("size of array is "+i);	
		for(int j=0; j<i; j++)
		{
			size[j]=sc.nextInt();
			
		}
		for(int no: size)
		{
			System.out.println("element of array is "+no);	
		}
	}

}
