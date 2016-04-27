package sols.impl;

import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();

		}

		int spCounter = 0;
		int pageCounter = 0;
		for (int i = 0; i < n; i++) {
			int prbs = arr[i];

			int iPagesCnt = pageCounter + prbs / k;
			// System.out.println("iPageCnt: "+iPagesCnt);
			if ((prbs % k > 0 && prbs > k) || prbs < k) {
				iPagesCnt++;
			}

			int lowRange = 0;
			int highRange = 0;
			int prbCnt = 1;
			for (int j = pageCounter; j < iPagesCnt; j++) {

				lowRange = prbCnt;
				if ((prbCnt + k - 1) <= prbs)
					highRange = prbCnt + k - 1;
				else {
					highRange = prbCnt + prbs % k - 1;
				}

				if (lowRange <= (j + 1) && (j + 1) <= highRange) {
					spCounter++;
				}

				prbCnt += k;
			}
			pageCounter = iPagesCnt;
		}

		System.out.println(spCounter);
		in.close();
	}
}
