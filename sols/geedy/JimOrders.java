package sols.geedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JimOrders {
	public static List<Integer> sortMapByValue(Map<Integer, Integer> map) {

		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(
				map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> m1,
					Map.Entry<Integer, Integer> m2) {
				// System.out.println(m1.getKey()+":"+m1.getValue());
				return (m1.getValue()).compareTo(m2.getValue());
			}
		});

		List<Integer> li = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> m : list) {
			li.add(m.getKey());
		}
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {

			int val = in.nextInt();
			val += in.nextInt();
			map.put(i + 1, val);
		}
		List<Integer> li = sortMapByValue(map);

		for (int i = 0; i < li.size(); i++) {
			System.out.print(li.get(i) + " ");
		}
		in.close();
	}
}
