package sols.bitmanipl;

import java.util.Scanner;

public class MaxiXOR {
	static int maxXor(int l, int r) {
		int res = 0;
		int j = l;
		while (j <= r) {
			for (int i = l; i <= r; i++) {
				if (res < (i ^ j)) {
					res = i ^ j;
				}
			}
			j++;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		_l = Integer.parseInt(in.nextLine());

		int _r;
		_r = Integer.parseInt(in.nextLine());

		res = maxXor(_l, _r);
		System.out.println(res);
		in.close();
	}
}
