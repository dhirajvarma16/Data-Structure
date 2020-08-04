package JavaProgramPractice2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunWithAnagrams {
	/*
	 * ------ Problem Stattement-------- s = ['code', 'doce', 'ecod', 'framer',
	 * 'frame']
	 */

	public static boolean areAnagram(String w1, String w2) {
		char[] chr1 = w1.toCharArray();
		char[] chr2 = w2.toCharArray();

		// Sorting the two arrays and checking for equality also works, but this is
		// faster

		int[] count = new int[26];
		for (char ch : chr1) {
			count[ch - 97] = count[ch - 97] + 1;
		}

		for (char ch : chr2) {
			count[ch - 97] = count[ch - 97] - 1;
		}

		for (int n : count) {
			if (n != 0) {
				return false;
			}
		}

		return true;
	}

	public static List<String> funWithAnagrams(List<String> s) {
		List<String> ans = new ArrayList<String>();
		Set<String> found = new HashSet<String>();
		for (int i = 0; i < s.size(); i++) {
			String word = s.get(i);
			String key = key(word);
			if (!found.contains(key)) {
				ans.add(word);
				found.add(key);
			}

		}

		Collections.sort(ans);

		return ans;
	}

	public static String key(String word) {
		char[] chrs = word.toCharArray();
		Arrays.sort(chrs);
		// System.out.println("Chars --->" + new String(chrs));
		System.out.println("Chars --->" + new String(chrs));
		return new String(chrs);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// List<String> a = Arrays.asList("code", "doce", "ecod", "framer", "frame");
		List<String> a = Arrays.asList("code", "doce", "ecod", "framer", "frame");
		System.out.println(funWithAnagrams(a));
	}

}
