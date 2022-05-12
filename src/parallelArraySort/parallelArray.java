package parallelArraySort;

import java.util.Arrays;

public class parallelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,2,4,0,5,7};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		Arrays.parallelSort(arr);
		System.out.println("\nSorted Elements are :");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
