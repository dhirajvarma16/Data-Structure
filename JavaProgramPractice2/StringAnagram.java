package JavaProgramPractice2;

import java.util.ArrayList;
import java.util.List;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> resuList = new ArrayList();
		if (s.length() == 0 || s == null) {
			return resuList;
		}
		int[] char_count = new int[26];
		for (char c : p.toCharArray()) {
			char_count[c - 'a']++;
		}
		int left = 0;
		int right = 0;
		int count = p.length();

		while (right < s.length()) {

		}

	}

}
