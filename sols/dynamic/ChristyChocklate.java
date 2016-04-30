package sols.dynamic;

import java.util.Scanner;

public class ChristyChocklate {

	static int greedy(int num){
		return ((num/5)+ (num%5)/2 + ((num%5)%2));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int[] ops = new int[t];
		
		for(int i=0;i<t;i++){
			
			int n = in.nextInt();
			int[] arr = new int[n];
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for(int j=0;j<n;j++){
				arr[j] = in.nextInt();
				if(min>arr[j]){
					min=arr[j];
				}
				if(max<arr[j]){
					max = arr[j];
				}
			}
			
			int l =1;
			if(n<=6){
				l=3;
			}
			
			int[] sum = new int[l];
			for(int j=0;j<l;j++){
				
				sum[j]=0;
				for(int k=0;k<n;k++){
					int tmp = arr[k]  -min -j;
					if(tmp<0) tmp = tmp *-1;
					sum[j]+= greedy(tmp);
				}
			}
			
			min = Integer.MAX_VALUE;
			for(int j=0;j<l;j++){
				if(min>sum[j]){
					min=sum[j];
				}
			}
			
			ops[i]=min;
		}
		
		for(int i=0;i<t;i++){
			System.out.println(ops[i]);
		}
		in.close();
		
	}

}
