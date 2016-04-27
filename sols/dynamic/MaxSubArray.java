package sols.dynamic;

import java.util.Scanner;

public class MaxSubArray {
	static int contiguousSubArray(int arr[], int n) {

		int index;

		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (index = 0; index < n; index++) {
			currentSum = currentSum + arr[index];

			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		int[][] res = new int[t][2];
		for (int k = 0; k < t; k++) {

			int nonCont = 0;

			int n = in.nextInt();
			int[] arr = new int[n];

			boolean noNegative = true;
			boolean noPositive = true;

			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
				if (arr[i] > 0) {
					nonCont += arr[i];
					noPositive = false;
				} else if (arr[i] < 0) {
					noNegative = false;
				}
			}

			if (noNegative) {
				res[k][0] = nonCont;
				res[k][1] = nonCont;
			} else if (noPositive) {
				res[k][0] = contiguousSubArray(arr, n);
				res[k][1] = res[k][0];
			} else {
				res[k][0] = contiguousSubArray(arr, n);
				res[k][1] = nonCont;
			}
		}
		for (int k = 0; k < t; k++) {
			System.out.println(res[k][0] + " " + res[k][1]);
		}
		in.close();
	}
}
