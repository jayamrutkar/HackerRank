package sols.impl;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLong {

	static BigInteger fact(int n){
		if(n==1){
			return new BigInteger("1");
		}
		return fact(n-1).multiply(new BigInteger(String.valueOf(n)));
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fact(n));
        in.close();
    }
}
