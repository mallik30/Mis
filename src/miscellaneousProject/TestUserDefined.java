package miscellaneousProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUserDefined {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dob = dateFormat.parse("20/02/2000");
		
		//System.out.println(dob); //Output: Sun Feb 20 00:00:00 CST 2000
		//To format the date in dd/MM/yyyy add dateFormat.format(dob)
		System.out.println(dateFormat.format(dob));

	}

}
