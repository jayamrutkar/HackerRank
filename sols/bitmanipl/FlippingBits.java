package sols.bitmanipl;

import java.util.Scanner;

public class FlippingBits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		long[] result = new long[t];
		for(int i=0;i<t;i++){
	    
			long num = in.nextLong();
			result[i]= ~num & 0xFFFFFFFFL;
		    
		}
		
		for(int i =0 ;i<t;i++){
			System.out.println(result[i]);
		}
		in.close();
    }
}
