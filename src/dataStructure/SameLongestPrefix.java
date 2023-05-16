package dataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLongestPrefix {

	public static void main(String[] args) {
		String[] string = { "AAA", "AAB", "ACC", "ABC" };
		Arrays.sort(string);

		String prefix = "";
		int result = 0;

		for (int i = 0; i < string[0].length(); i++) {
			if (string[string.length - 1].charAt(i) == string[0].charAt(i)) {
				prefix += string[0].charAt(i);
				result++;
			}
		}
		System.out.println("Result: " + result + " Prefix: " + prefix);
	}

}
