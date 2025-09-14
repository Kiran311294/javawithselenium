package Module1.basicjava;

import java.util.Arrays;

public class Assig30charcount {
	static int alphabetcount =0;
	static int numcount =0;
	static int splcharcount =0;
	static int spacecount =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String charcount = "sdsads 24343dsfadsf @@#$$";
		char[] cc= charcount.toCharArray();
		System.out.println(cc);
		System.out.println(Arrays.toString(cc));
		for(int i=0;i<cc.length;i++)
		{
		Boolean bl1= Character.isAlphabetic(cc[i]);
		Boolean bl2= Character.isDigit(cc[i]);
		Boolean bl3= Character.isWhitespace(cc[i]);
		Boolean bl4= Character.isEmoji(cc[i]);
		
		if(bl1==true)
		{
			alphabetcount++;
		}
		if(bl2==true)
		{
			numcount++;
		}
		if(bl3==true)
		{
			spacecount++;
		}
		if(bl4==true)
		{
			splcharcount++;
		}
		
		}
		System.out.println(alphabetcount);
		System.out.println(numcount);
		System.out.println(spacecount);
		System.out.println(splcharcount);
	}

}
