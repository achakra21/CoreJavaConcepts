import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Abhijit
 *
 */
public class DateTimeFormart {

	public static void main(String args[]) throws ParseException {

		System.out.println(convertMMM_dd_yyyy_HH_mmaaaToyyyy_MM_dd_T_HH_mm_ss_SSSXXX("Feb  2 2017  1:19PM"));

	}

	
	
	/**
	 * convert time from MMM dd yyyy HH:mmaaa to yyyy-MM-dd'T'HH:mm:ss.SSSXXX
	 * @param time
	 * @return
	 * @throws ParseException
	 */
	public static String convertMMM_dd_yyyy_HH_mmaaaToyyyy_MM_dd_T_HH_mm_ss_SSSXXX(String time) throws ParseException {
		
		SimpleDateFormat sdfSource = new SimpleDateFormat("MMM dd yyyy HH:mmaaa");
		Date date = sdfSource.parse(time);

		SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		
		return sdfDestination.format(date);
	}

}
