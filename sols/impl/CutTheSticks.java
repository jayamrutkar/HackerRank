package sols.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int min = -1;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (min == -1 || min > arr[arr_i])
				min = arr[arr_i];
		}

		int count = n;
		List<Integer> list = new ArrayList<Integer>();
		while (count > 0) {

			int cnt = 0;
			int lmin = -1;
			for (int i = 0; i < n; i++) {

				if (arr[i] > 0) {
					arr[i] = arr[i] - min;
					cnt++;
					if ((lmin == -1 || lmin > arr[i]) && arr[i] > 0)
						lmin = arr[i];
				}

			}
			count = cnt;
			if (cnt > 0)
				list.add(cnt);
			min = lmin;
		}

		for (Integer i : list) {
			System.out.println(i);
		}
		in.close();
	}
}
