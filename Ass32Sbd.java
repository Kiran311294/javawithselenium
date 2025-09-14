package Module1.basicjava;

public class Ass32Sbd {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Letme");
		sb1.append(" do API testing");
		System.out.println(sb1);
		sb1.insert(3, " ");
		System.out.println(sb1);
		sb1.replace(10, 13, "automation");
		System.out.println(sb1);
	}

}
