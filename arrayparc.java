package Module1.basicjava;
import java.util.Arrays;

public class arrayparc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]=new String[5];
		a[0]="kaa";
		a[1]="aduu";
		a[2]="subodh";
		a[3]="Family";
		//a.reverse();
		String a2[]=new String[a.length];
		for (int i=0,j=4;i<a.length;i++,j--)
		{
			a2[j]=a[i];
		}
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(a2));
	
	}

}
