package sols.strings;

import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Integer numTests = Integer.parseInt(input.nextLine());

		String[] result = new String[numTests];

		for (int i = 0; i < numTests; i++) {
			String inputStr = input.nextLine();

			char[] sourceArr = inputStr.toCharArray();
			boolean isFunny = true;

			String revStr = new StringBuilder(inputStr).reverse().toString();
			char[] revArray = revStr.toCharArray();

			int len = revArray.length;

			for (int j = 1; j < len - 1; j++) {

				int sourcediff = (sourceArr[j] - sourceArr[j - 1]);
				if (sourcediff < 0) {
					sourcediff *= -1;
				}
				int targetdiff = (revArray[j - 1] - revArray[j]);
				if (targetdiff < 0) {
					targetdiff *= -1;
				}
				if (sourcediff != targetdiff) {
					isFunny = false;
				}

			}
			if (isFunny) {
				result[i] = "Funny";
			} else {
				result[i] = "Not Funny";
			}
		}

		for (int i = 0; i < numTests; i++) {
			System.out.println(result[i]);
		}
		input.close();
	}
}
