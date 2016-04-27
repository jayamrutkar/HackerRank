package sols.geedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TwoArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		boolean[] res = new boolean[t];

		for (int a0 = 0; a0 < t; a0++) {

			int n = in.nextInt();
			int k = in.nextInt();

			List<String> aList = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				aList.add(String.valueOf(in.nextLong()));
			}

			Collections.sort(aList, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return extractInt(o2) - extractInt(o1);
				}

				int extractInt(String s) {
					String num = s.replaceAll("\\D", "");
					// return 0 if no digits found
					return num.isEmpty() ? 0 : Integer.parseInt(num);
				}
			});

			List<String> bList = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				bList.add(String.valueOf(in.nextLong()));
			}
			Collections.sort(bList, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return extractInt(o1) - extractInt(o2);
				}

				int extractInt(String s) {
					String num = s.replaceAll("\\D", "");
					// return 0 if no digits found
					return num.isEmpty() ? 0 : Integer.parseInt(num);
				}
			});

			boolean found = true;

			while (!aList.isEmpty() || !bList.isEmpty()) {
				String min = Collections.min(aList);
				long ele = Long.parseLong(min);
				int pos = aList.indexOf(min);
				if ((ele + Long.parseLong(bList.get(pos))) < k) {
					found = false;
					break;
				}
				aList.remove(pos);
				bList.remove(pos);

				if (!bList.isEmpty()) {
					min = Collections.max(bList);
					ele = Long.parseLong(min);
					pos = bList.indexOf(min);
					if ((ele + Long.parseLong(aList.get(pos))) < k) {
						found = false;
						break;
					}
					aList.remove(pos);
					bList.remove(pos);
				}
			}
			res[a0] = found;

		}

		for (int i = 0; i < t; i++) {
			if (res[i]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}
}
