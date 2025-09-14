package Module1.basicjava;

import java.util.Date;

public class AssignDate21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= new Date();
		System.out.println(date.getTime());
		Date d2=new Date(date.getTime());
		String user = d2.toString();
		System.out.println(user);
		String currenttime = user.substring(8, 16);
		System.out.println("Current time is "+currenttime);
		Date d3=new Date(date.getTime()+(100*60*60*24));
		String Featutetime = d3.toString();
		String Featutetime2 = Featutetime.substring(8, 16);
		System.out.println("Featute time is "+Featutetime2);
		Date d4=new Date(date.getTime()-(100*60*60*24));
		String Pasttime = d4.toString();
		String pasttime2 = Pasttime.substring(8, 16);
		System.out.println("Past time is "+pasttime2);
		String month = user.substring(4, 7);
		String date1 = user.substring(8, 10);
		String year = user.substring(user.length()-4);
		System.out.println(date1.concat("/").concat(month).concat("/").concat(year));

	}

}
