package sols.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimeInWords {

	private static Map<Integer, String> numMap = new HashMap<Integer, String>();
	static {

		numMap.put(1, "One");
		numMap.put(2, "Two");
		numMap.put(3, "Three");
		numMap.put(4, "Four");
		numMap.put(5, "Five");
		numMap.put(6, "Six");
		numMap.put(7, "Seven");
		numMap.put(8, "Eight");
		numMap.put(9, "Nine");
		numMap.put(10, "Ten");

		numMap.put(11, "Eleven");
		numMap.put(12, "Tweleve");
		numMap.put(13, "Thirteen");
		numMap.put(14, "Fourteen");
		numMap.put(15, "Fifteen");
		numMap.put(16, "Sixteen");
		numMap.put(17, "Seventeen");
		numMap.put(18, "Eighteen");
		numMap.put(19, "Nineteen");
		numMap.put(20, "Twenty");

		numMap.put(21, "Twenty One");
		numMap.put(22, "Twenty Two");
		numMap.put(23, "Twenty Three");
		numMap.put(24, "Twenty Four");
		numMap.put(25, "Twenty Five");
		numMap.put(26, "Twenty Six");
		numMap.put(27, "Twenty Seven");
		numMap.put(28, "Twenty Eight");
		numMap.put(29, "Twenty Nine");

	}

	private static String getWord(int hour, int time) {
		String returnStr = "";
		int snum = time;
		if (snum != 15 && snum > 1 && snum <= 29) {
			snum = 2;
		} else if (snum != 45 && snum > 30 && snum < 60) {
			snum = 31;
		}

		int tmpHour = hour + 1;
		if (hour == 12) {
			tmpHour = 1;
		}

		switch (snum) {
		case 0:
			returnStr = numMap.get(hour) + " o' clock";
			break;
		case 1:
			returnStr = "one minute past " + numMap.get(hour);
			break;
		case 2:
			returnStr = numMap.get(time) + " minutes past " + numMap.get(hour);
			break;
		case 15:
			returnStr = "quarter past " + numMap.get(hour);
			break;
		case 30:
			returnStr = "half past " + numMap.get(hour);
			break;
		case 31:
			if (time > 30) {
				time = 60 - time;
			}
			if (time == 1) {
				returnStr = numMap.get(time) + " minute to "
						+ numMap.get(tmpHour);
			} else {
				returnStr = numMap.get(time) + " minutes to "
						+ numMap.get(tmpHour);
			}
			break;
		case 45:
			returnStr = "quarter to " + numMap.get(tmpHour);
			break;
		}
		return returnStr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();

		if (h > 0)
			System.out.println(getWord(h, m).toLowerCase());
		in.close();
	}
}
