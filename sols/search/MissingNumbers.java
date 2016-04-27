package sols.search;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Integer[] arr = new Integer[1000010];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			int l = in.nextInt();
			arr[l] = ++arr[l];
		}

		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			int k = in.nextInt();
			arr[k] = --arr[k];
		}

		List<Integer> list = Arrays.asList(arr);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				System.out.print(i + " ");
			}
		}

		in.close();
	}
}
