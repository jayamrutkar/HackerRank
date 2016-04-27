package sols.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GameOfThrones {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();

		boolean bFound = true;
		// Assign ans a value of YES or NO, depending on whether or not
		// inputString satisfies the required condition
		int len = inputString.length();

		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			Character ch = inputString.charAt(i);
			if (charCountMap.get(ch) != null) {
				int count = charCountMap.get(ch);
				charCountMap.put(ch, count + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}

		boolean oddNum = false;
		if (len % 2 == 0) {
			oddNum = true;
		}
		Set<Character> charSet = charCountMap.keySet();
		for (Character ch : charSet) {
			int cnt = charCountMap.get(ch);
			if (cnt % 2 == 1) {
				if (!oddNum)
					oddNum = true;
				else {
					bFound = false;
					break;
				}
			}

		}

		if (bFound) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		myScan.close();
	}
}
