package sols.impl;

import java.util.Scanner;

public class CaeserCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();

		char[] arr = s.toCharArray();
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = s.charAt(i);
			int num1 = num;
			if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
				cnt++;
				num = num + k % 26;
				if (num > 90 && (num1 >= 65 && num1 <= 90)) {
					num = num - 26;
				} else if (num > 122) {
					num = num - 26;
				}
			}
			arr[i] = (char) (num);
			if (cnt >= n) {
				break;
			}
		}
		System.out.println(String.valueOf(arr));
		in.close();

	}
}
