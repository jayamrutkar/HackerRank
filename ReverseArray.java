package ds.array;

import java.util.Scanner;

public class ReverseArray {

	
	public static void reverse(int[] arr){

		int n  = arr.length;
		int j = n-1;
		for(int i=0;i<n/2; i++,j--){
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        reverse(arr);
        for(int i=0; i<n; i++){
        	System.out.print(arr[i]+" ");
        }
    }
	
	
}
