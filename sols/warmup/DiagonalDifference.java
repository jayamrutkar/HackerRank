package sols.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
		int matrixSize = input.nextInt();
		
		int[][] arr = new int[matrixSize][matrixSize];
		long d1= 0L, d2=0L;
		
		int m=0,n=matrixSize-1;
		for(int i=0;i<matrixSize;i++){
			for(int j=0;j<matrixSize;j++){
				arr[i][j]=input.nextInt();
				if(i==j){
					d1+=arr[i][j];
				}
							
				if(i==m && n==j){
					d2+=arr[i][j];
				}
			}
			m++;
			n--;
		}
		
		long res = d1-d2;
		if(res<0){
			res= res*-1;
		}
		System.out.println(res);
		input.close();
    }
}
