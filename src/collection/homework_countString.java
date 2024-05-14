package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework_countString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			m.put(ch, m.containsKey(ch) ? m.get(ch) + 1 : 1);
		}
		System.out.println(m);
	}
}
