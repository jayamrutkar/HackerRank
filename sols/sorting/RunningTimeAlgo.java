package sols.sorting;

import java.util.Scanner;

public class RunningTimeAlgo {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int len = ar.length;
		int count = 0;
		for (int j = 1; j < len; j++) {
			int key = ar[j];
			int i = j - 1;
			while ((i > -1) && (ar[i] > key)) {
				ar[i + 1] = ar[i];
				i--;
				count++;
			}
			ar[i + 1] = key;
			// printArray(ar);
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

}
