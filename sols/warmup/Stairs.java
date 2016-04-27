package sols.warmup;

import java.util.Scanner;

public class Stairs {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);

		int stairs = input.nextInt();

		int k = stairs - 1;
		while (k >= 0) {
			for (int i = 0; i < stairs; i++) {

				if (i >= k) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			k--;
		}
		input.close();
	}
}
