package sols.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int size = Integer.parseInt(input.nextLine());

		String line = input.nextLine();
		String[] temp = line.split(" ");

		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += Integer.parseInt(temp[i]);

		}
		System.out.println(sum);
		input.close();
		
	}
}
