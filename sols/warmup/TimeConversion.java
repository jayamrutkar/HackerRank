package sols.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		String time = in.next();

		DateFormat format = new SimpleDateFormat("hh:mm:ssa");
		Date d1 = format.parse(time);
		format = new SimpleDateFormat("HH:mm:ss");
		System.out.println(format.format(d1));
		in.close();
	}
}
