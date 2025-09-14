package Module1.basicjava;

public class matchesassigne24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String match = "MatchStringTest";
		  System.out.println(match.matches("M(.*)"));
		  System.out.println(match.matches("T(.*)"));
		  System.out.println(match.matches("(.*)t"));
		  System.out.println(match.matches("(.*)z"));
		  System.out.println(match.matches("(.*)String(.*)"));
	}

}
