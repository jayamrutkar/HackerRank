package sols.impl;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String inputStr = in.nextLine();
		inputStr = inputStr.replaceAll(" ", "");
		int len = inputStr.length();

		if (len < 3) {

			char[] ch = inputStr.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i] + " ");
			}
		} else {
			double d = Math.sqrt(len);
			int columns = (int) Math.ceil(d);
			int rows = (int) Math.ceil(d);

			String[] res = new String[rows];
			int j = 0;
			for (int i = 0; i < rows; i++) {
				j = 0;
				String s1 = "";
				while (j < columns) {
					// System.out.println(inputStr.charAt(i+j*columns));
					if (i + j * rows >= len)
						break;
					s1 += inputStr.charAt(i + j * rows);
					j++;
				}
				res[i] = s1;
			}

			String outStr = "";
			for (String l : res) {
				outStr += l + " ";
			}

			System.out.println(outStr);
		}
		in.close();
	}
}
