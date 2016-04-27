package sols.sorting;

import java.util.Scanner;

public class QuickSort1 {

	static void partition(int[] ar) {
		int left = 1;
		int right = ar.length - 1;

		int pivot = ar[0];
		int m = 0;
		while (left <= right) {

			while (left <= right && ar[left] > pivot) {
				left++;
			}

			int k = m;
			while (left <= right && k < left) {
				int tmp = ar[k];
				ar[k] = ar[left];
				ar[left] = tmp;
				k++;
			}
			left++;
			m++;
		}
		printArray(ar);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
		in.close();
	}
}
