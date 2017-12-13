package miscellaneousProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateAge {

	public static void main(String[] args) throws ParseException {
		
		Calendar todayCalendar = Calendar.getInstance(); //calendar object
		
		//user defined date object							format
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		//we create date object and storing in dob
		Date dob = dateFormat.parse("20/4/1990");
				
		//dob calendar object, we need to store the data in it
		Calendar dobCalendar = Calendar.getInstance(); 
		
		//method, we need to pass the date, but first we need to create user defined data object line 14
		// by using set time we are storing user defined data into calendar object
		dobCalendar.setTime(dob); // by calling the dob we are storing it in dobCalender
		

		int age = todayCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);

		System.out.println("Age : "+age);
		
	
	}

}
