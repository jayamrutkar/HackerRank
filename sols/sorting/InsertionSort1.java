package sols.sorting;

import java.util.Scanner;

public class InsertionSort1 {
	public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
         int len=ar.length;
        int key=ar[len-1];
        int j=len-2;
		while(j>=0){
			if(ar[j]>key){
			     ar[j+1]=ar[j];	
			}else{
                break;
            }
			
			printArray(ar);
			j--;
		}
		ar[j+1]=key;
        printArray(ar);
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
        in.close();
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
