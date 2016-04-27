package sols.impl;

import java.util.BitSet;
import java.util.Scanner;

public class ACMICPCTeam {

private static BitSet fromString(final String s) {
		
		//BigInteger b = new BigInteger(s);
		byte[] byteArr = new byte[s.length()];
		char[] arr =s.toCharArray();
		for(int i=0;i<s.length();i++){
			byteArr[i] = (byte) Character.getNumericValue(arr[i]);
		}
		return BitSet.valueOf(byteArr);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String topic[] = new String[n];
		for (int topic_i = 0; topic_i < n; topic_i++) {
			topic[topic_i] = in.next();
		}
		
		int count=0;
		int maxCardinality=0;
		
		for(int i=0;i<n;i++){
			
			BitSet bi = fromString(topic[i]);
			for(int j=i+1;j<n;j++){
				
				BitSet bj = fromString(topic[j]);
				bj.or(bi);
			
				if(bj.cardinality()>maxCardinality){
					count=1;
					maxCardinality=bj.cardinality();
				}else if(bj.cardinality()==maxCardinality){
					count++;
				}
			}

		}
		
		System.out.println(maxCardinality);
		System.out.println(count);
		in.close();
	}
}
