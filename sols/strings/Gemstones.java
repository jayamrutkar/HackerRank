package sols.strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Gemstones {
	public static Set<Character> convertStringToSet(String str) {
		Set<Character> set = new TreeSet<Character>();
		char[] arr = str.toCharArray();
		for (char c : arr) {
			set.add(c);
		}
		return set;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		Set<Character> set = new TreeSet<Character>();
		for (int i = 0; i < t; i++) {
			String str = in.nextLine();
			if (i == 0) {
				set = (convertStringToSet(str));
			} else {
				set.retainAll(convertStringToSet(str));
			}
		}
		System.out.println(set.size());
		in.close();
	}
}
