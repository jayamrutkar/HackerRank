package sols.sorting;

import java.util.Scanner;

public class CountingSort2 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int[] res = new int[100];
		for(int i=0;i<res.length;i++){
			res[i]=0;
		}
		
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			int v = in.nextInt();
			res[v] = res[v]+1;
		}
		
		for(int i=0;i<res.length;i++){
			int m= res[i];
			while(m!=0){
				System.out.print(i+" ");
				m--;
			}
		}
		
		in.close();
	}
}
