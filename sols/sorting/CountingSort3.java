package sols.sorting;

import java.util.Scanner;

public class CountingSort3 {

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
			String s = in.nextLine();
		}
		
		int m=0;
		for(int i=0;i<res.length;i++){
			m+= res[i];
			System.out.print(m+" ");
		}
		
		in.close();
	}
}
