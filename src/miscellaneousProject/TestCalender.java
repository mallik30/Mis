package miscellaneousProject;

import java.util.Calendar;

public class TestCalender {

	public static void main(String[] args) {
	
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Day of the year "+calendar.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("Week of the year "+calendar.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("Month of the year "+calendar.get(Calendar.MONTH));
		
		System.out.println("Day of the month "+calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Day of the week "+calendar.get(Calendar.DAY_OF_WEEK));
	
	
	}

}
