package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PileOfSocks {

	public static void main(String[] args) {
		List<Integer> sock = new ArrayList<>();
		sock.add(10);
		sock.add(20);
		sock.add(20);
		sock.add(10);
		sock.add(10);
		sock.add(30);
		sock.add(50);
		sock.add(10);
		sock.add(20);

		int n = sock.size();
		System.out.println("Total pairs of socks: " + sockMerchant(n, sock));
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		int pairs = 0;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (!hs.contains(ar.get(i))) {
				hs.add(ar.get(i));
			} else {
				hs.remove(ar.get(i));
				pairs++;
			}
		}
		return pairs;
	}
}
