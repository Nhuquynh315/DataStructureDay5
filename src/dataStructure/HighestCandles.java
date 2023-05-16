package dataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HighestCandles {

	public static void main(String[] args) {
		ArrayList<Integer> candles = new ArrayList<Integer>();
		candles.add(3);
		candles.add(2);
		candles.add(1);
		candles.add(3);

		System.out.println("The highest unit is: " + Collections.max(candles));

		int count = 0;
		for (int i = 0; i < candles.size(); i++) {

			int num = candles.get(i);
			if (num >= Collections.max(candles)) {
				count++;
			}
		}
		System.out.println("Number of the highest candles are: " + count);
	}
}
