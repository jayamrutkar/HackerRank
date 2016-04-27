package sols.strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		String[] result = new String[t];

		for (int a0 = 0; a0 < t; a0++) {
			String a = in.nextLine();
			String b = in.nextLine();

			Set<Character> charCountSet = new TreeSet<Character>();
			for (int i = 0; i < a.length(); i++) {
				Character ch = a.charAt(i);
				charCountSet.add(ch);
			}

			boolean commonChars = false;
			for (int i = 0; i < b.length(); i++) {
				Character ch = b.charAt(i);
				if (charCountSet.contains(ch)) {
					commonChars = true;
					break;
				}
			}

			if (commonChars) {
				result[a0] = "YES";
			} else {
				result[a0] = "NO";
			}

		}
		for (int m = 0; m < t; m++) {
			System.out.println(result[m]);
		}
		in.close();
	}
}
