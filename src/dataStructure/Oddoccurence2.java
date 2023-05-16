package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Oddoccurence2 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		System.out.println(findOddTimesAppearNum(array));

	}

	public static List<Integer> findOddTimesAppearNum(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			
			if (map.containsKey(arr[i])) { //count i appeared
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1); //first time appear
			}

		}
		List<Integer> oddAppear = new ArrayList<>(); //find odd numbers
		for (int key : map.keySet()) {
			if (map.get(key) % 2 != 0) {
				oddAppear.add(key);
			}
		}
		return oddAppear;
	}
}