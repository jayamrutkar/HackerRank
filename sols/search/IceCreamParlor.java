package sols.search;

import java.util.Scanner;

public class IceCreamParlor {

public static boolean found=false;
	
	public static void checkLeftRightSum(int[] arr, int i, int j){
	
		//System.out.println(found);
		if(found){
			return;
		}
		//System.out.println(i+"::"+j);
		if((j-i)<2){
			return;
		}
		
		long leftSum =0, rightSum =0;
		int mid =(i+j)/2;
		//System.out.println(i+":"+mid+":"+j);
		for(int l=0;l<mid;l++){
			leftSum+=arr[l];
		}
		for(int l=mid+1;l<arr.length;l++){
			rightSum+=arr[l];
		}
		//System.out.println("sum:"+leftSum+"::"+rightSum);
		if(leftSum==rightSum){
			found=true;
			return;
		}
		if(leftSum>rightSum)
			checkLeftRightSum(arr, i, mid);
		if(rightSum>leftSum)
			checkLeftRightSum(arr, mid, j);
		
	}

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		boolean[] result = new boolean[t];
		
		for(int i=0;i<t;i++){
			
			found=false;
			
			int n = in.nextInt();
			int[] a = new int[n];
			for(int j=0;j<n;j++){
				a[j]=in.nextInt();
			}
			if(n>2)
				checkLeftRightSum(a, 0, n-1);
			else if(n==1){
				found=true;
			}else if(n==2){
				if(a[0]==a[1]) {
					found=true;
				}
			}
			result[i]=found;
		}
		
		for(int i=0;i<t;i++){
			if(result[i])
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		in.close();
	}
	
}
