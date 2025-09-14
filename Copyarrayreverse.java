package Module1.basicjava;

import java.util.Arrays;

public class Copyarrayreverse {

	public static void main(String[] args) {
		int arrayr[]=new int[5];
		arrayr[0]=9;
		arrayr[1]=29;
		arrayr[2]=49;
		arrayr[3]=79;
		int arrayr2[]=new int[arrayr.length];
		for(int i=0,j=3;i<=arrayr.length;i++,j--)
		{
			arrayr2[j]=arrayr[i];
		}
		
		System.out.println(Arrays.toString(arrayr));
		System.out.println(Arrays.toString(arrayr2));

	}

}
