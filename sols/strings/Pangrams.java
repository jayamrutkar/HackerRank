package sols.strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pangrams {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = input.nextLine();

		if (line != null && line.length() >= 1 && line.length() <= 1000) {

			String resultStr = line.replaceAll(" ", "");
			resultStr = resultStr.toLowerCase();
			char[] ch = resultStr.toCharArray();
			Set<Character> set = new TreeSet<Character>();

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 'a' && ch[i] <= 'z')
					set.add(ch[i]);
			}

			if (set.size() == 26) {
				System.out.println("pangram");
			} else {
				System.out.println("not pangram");
			}
		}
		input.close();
	}
}
