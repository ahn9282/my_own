package justFUN;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2, 5, 23, 456, 342, 62,15,27};
		int[] arrs = { 2, 5, 23, 456, 342, 62};
		int count=0;
		Arrays.sort(arrs);
		boolean run = true;
		
			for(int i = 1 ; i < arr.length; i++) {
				
				for(int j = 0; j < arr.length - i; j++) {
					count++;
					if(arr[j] > arr [j + 1]) {
						swap(arr, j, j + 1);
					} 
				}
			}
		
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println(count);
	}
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
