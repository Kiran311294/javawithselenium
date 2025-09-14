package Module1.basicjava;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Kiran";
		int age = 20;
		if(name=="Kiran" && age>=18) 
		 {
			System.out.println("you are in");
		 }
		if(name=="Kiran" || age>=30) 
		 {
			System.out.println("you are in");
		 }
		if(!(name=="ffdf" || age>=18))
		 {
			System.out.println("you are in 2");
		 }
		if(!(name=="ffdf" && age>=18))
		 {
			System.out.println("you are in 3");
		 }
		else
		{
			System.out.println("you cant vote");
		}
	}
	

}
