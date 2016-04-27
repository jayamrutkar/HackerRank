package sols.strings;

import java.util.Scanner;

public class AlternateChars {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Integer numTests = Integer.parseInt(input.nextLine());

		int[] result = new int[numTests];

		for (int i = 0; i < numTests; i++) {
			String inputStr = input.nextLine();

			char[] arr = inputStr.toCharArray();
			int count = 0;
			if (arr.length > 1) {
				char tmp = arr[0];

				for (int j = 1; j < arr.length; j++) {
					if (arr[j] == tmp) {
						count++;
					} else {
						tmp = arr[j];
					}
				}

			}
			result[i] = count;
		}

		for (int i = 0; i < numTests; i++) {
			System.out.println(result[i]);
		}
		input.close();
	}
}
