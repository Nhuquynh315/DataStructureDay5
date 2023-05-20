package dataStructure;

import java.util.ArrayList;

public class KthFactor {

	public static void main(String[] args) {
		int n1 = 12, k1 = 6;
		int n2 = 4, k2 = 4;

		System.out.println("The " + k1 + "th factor of " + n1 + " is: " + getKthFactor(n1, k1));
		System.out.println("The " + k2 + "th factor of " + n2 + " is: " + getKthFactor(n2, k2));
	}

	public static int getKthFactor(int n, int k) {
		ArrayList<Integer> factor = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factor.add(i);
			}
		}
		System.out.println("Factor list: " + factor.toString());

		if (0 < k && k <= factor.size()) {
			return factor.get(k - 1);
		} else {
			return -1;
		}
	}
}
