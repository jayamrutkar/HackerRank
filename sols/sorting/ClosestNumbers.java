package sols.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		Long[] arr = new Long[n];
		List<Long> ll = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			ll.add(in.nextLong());
		}
		Collections.sort(ll);
		arr = ll.toArray(arr);

		long max = Long.MAX_VALUE;
		List<Long[]> list = new ArrayList<Long[]>();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				long diff = arr[i] - arr[j];
				diff = Math.abs(diff);
				if (max > diff) {
					max = diff;
					list.clear();
				}
				if (diff == max) {
					long m1 = arr[i];
					long m2 = arr[j];
					if (m1 < m2)
						list.add(new Long[] { m1, m2 });
					else
						list.add(new Long[] { m2, m1 });
				}
				if (diff > max) {
					break;
				}

			}
		}

		Collections.sort(list, new Comparator<Long[]>() {
			@Override
			public int compare(Long[] o1, Long[] o2) {
				return o1[0].compareTo(o2[0]);
			}
		});

		for (Long[] l : list)
			System.out.print(l[0] + " " + l[1] + " ");

		in.close();
	}

}
