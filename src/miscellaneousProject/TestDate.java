package miscellaneousProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		String formatedDate = dateFormat.format(date);
		
		System.out.println(formatedDate);
		
	}

}
