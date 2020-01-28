package learning1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

   SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy");
   String str = "12-17-2020";
   Date dt = sdf.parse(str);
   System.out.println(dt);
		
   System.out.println(sdf.format(new Date()));
   
   
 
	}

}
