package dataStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MinimumGap {

	public static void main(String[] args) {
		int[] array = { 7, 1, 3, 4, 1, 7 };
		int[] array1 = { 2, 3, 4, 3, 2, 5, 6, 7 };
		int[] array2 = { 5, 6, 7, 5, 8, 9, 1, 5 };

		System.out.println(findMinimumGap(array));
		System.out.println(findMinimumGap(array1));
		System.out.println(findMinimumGap(array2));

	}

	public static int findMinimumGap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int minGap = Integer.MAX_VALUE;
		int pre = 0, current = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				current = i;
				pre = map.get(arr[i]);
				minGap = Math.min((current - pre), minGap);
			}
			map.put(arr[i], i);
		}
		return (minGap == Integer.MAX_VALUE ? -1 : minGap);

	}
}
