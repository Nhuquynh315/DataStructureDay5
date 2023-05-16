package dataStructure;

import java.util.Arrays;
import java.util.List;


public class OddOccurrence {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };	
		
		System.out.println((findOddAppear(array)));
			
		}
	

	public static int[] findOddAppear(int[] arr) {
	
		Arrays.sort(arr);

		boolean odd = true;
		int newlength = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				odd = !odd;
			} else {
				if (odd) {
					arr[newlength++] = arr[i - 1];
				}
			}
		}
		if (odd) {
			arr[newlength++] = arr[arr.length - 1];
		}
		return Arrays.copyOf(arr, newlength);
	}
}