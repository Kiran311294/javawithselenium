package Module1.basicjava;

import java.util.Scanner;

public class Assign23reverse {
	public static void main(String[] args) {
		String output="";
		Scanner sr=new Scanner(System.in);
		String reverse = sr.next();
		for (int i=reverse.length()-1; i>=0;i--)
		{
			char r=reverse.charAt(i);
			output=output+r;
		}
		  System.out.println("This is Input String->"+reverse);
          System.out.println("This is Reversed String->"+output);
          if(reverse.equals(output))
          {
        	  System.out.println("This is Palindorme");
          }
          else
          {
        	  System.out.println("This is not a Palindorme");
          }
          sr.close();
	}
	
	
	}

