package sols.warmup;

import java.util.Scanner;

public class VeryBigSum {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
		
		int len = input.nextInt();
		long sum=0;
		
		for(int i=0;i<len;i++){
			sum+=input.nextLong();
		}
		
		System.out.println(sum);
		input.close();
    }
}
