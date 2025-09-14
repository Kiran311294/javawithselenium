package Module1.basicjava;

import java.util.Arrays;

public class assign29analog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="Kiran Subodh Dumbre";
		String a2="Dumbre Kiran Subodh1";
		char ac1[] = a1.toCharArray();
		char ac2[] =a2.toCharArray();
		Arrays.sort(ac1);
		Arrays.sort(ac2);
		Boolean check = Arrays.equals(ac1, ac2);
		if(check==true)
		{
			System.out.println("This is Anagram");
		}
		else
		{
			System.out.println("This is not a Anagram");
		}
	}

}
