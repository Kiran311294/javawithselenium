package Module1.basicjava;

import java.util.Arrays;

public class new123 {

		public static void main(String[] args) 
		
			   {
	                
	                int array1[]=new int[4];
	                array1[0]=45;
	                array1[1]=35;
	                array1[2]=85;
	                array1[3]=65;
	                int array2[]=new int[array1.length];

	                for(int i=0,j=3;i<array1.length;i++,j--)
	                {
	                array2[j]        =                array1[i];
	                }
	                
	                //i=0,j=3,
	                
	                System.out.print("The Input Array is:-> ");
	                System.out.println(Arrays.toString(array1));
	                System.out.print("The Output Array is:-> ");
	                System.out.println(Arrays.toString(array2));
	        }

		}

