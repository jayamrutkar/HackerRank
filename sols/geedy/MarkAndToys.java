package sols.geedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarkAndToys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		long k = in.nextLong();

		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextLong());
		}

		Collections.sort(list);

		int total = 0;
		long price = 0;
		int i = 0;
		while (total <= k) {
			price = price + list.get(i);
			if (price <= k) {
				total++;
			} else {
				break;
			}
			i++;
		}

		System.out.println(total);
		in.close();
	}
}
