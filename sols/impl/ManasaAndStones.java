package sols.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		List<Set<Long>> resList = new ArrayList<Set<Long>>();

		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();

			Set<Long> list = new TreeSet<Long>();

			if (n > 1) {
				list.add((long) a * (n - 1));
				for (int i = 1; i < (n - 1); i++) {
					long calc = (a * (n - 1 - i) + b * i);
					list.add(calc);
				}
				list.add((long) b * (n - 1));
			} else {
				list.add((long) a * n);
				list.add((long) b * n);
			}

			resList.add(list);
		}

		for (Set<Long> list : resList) {
			for (Long item : list) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
