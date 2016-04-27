package sols.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LibraryFine {

	public static String createDate(int d, int m, int y) {
		String strDate = "";

		if (d < 10) {
			strDate += "0";
		}
		strDate += String.valueOf(d) + "/";

		if (m < 10)
			strDate += "0";
		strDate += String.valueOf(m) + "/";

		strDate += String.valueOf(y);

		return strDate;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();

		String date1 = createDate(d1, m1, y1);
		String date2 = createDate(d2, m2, y2);

		int fine = 0;

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dateObj1 = format.parse(date1);
			Date dateObj2 = format.parse(date2);

			Calendar c1 = Calendar.getInstance();
			c1.setTime(dateObj1);
			Calendar c2 = Calendar.getInstance();
			c2.setTime(dateObj2);

			long diff = c1.getTimeInMillis() - c2.getTimeInMillis();
			if (diff > 0) {
				long days = diff / 1000 / 60 / 60 / 24;
				int diffYears = c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
				int diffMonths = diffYears * 12 + c1.get(Calendar.MONTH)
						- c2.get(Calendar.MONTH);

				if (diffYears > 0)
					fine = 10000;
				else if (diffMonths > 0)
					fine += diffMonths * 500;
				else
					fine += days * 15;
			}
		} catch (ParseException e) {
		}

		System.out.println(fine);
		in.close();
	}
}
