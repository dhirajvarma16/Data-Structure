package JavaProgramPractice2;

import java.util.Scanner;

public class CheckValidAnagrams {

	public static void main(String[] args) {
		CheckValidAnagrams checkValidAnagrams = new CheckValidAnagrams();
		Scanner scanner = new Scanner(System.in);
		String stringvalue1, stringvalue2;
		stringvalue1 = scanner.next();
		stringvalue2 = scanner.next();
		char[] ch = new char[1];
		int toCheckchdefault = ch[0]--;
		System.out.println("Char default value :" + toCheckchdefault);

		checkValidAnagrams.isAnagram(stringvalue1, stringvalue2);
	}

	public boolean isAnagram(String stringvalue1, String stringvalue2) {
		char[] ch = new char[26];
		for (int i = 0; i < stringvalue1.length(); i++) {
			// ch[stringvalue1.charAt(i) - 'a']++;
			System.out.println("String value 1-->" + ch[stringvalue1.charAt(i) - 'a']++);
			// ch[stringvalue2.charAt(i) - 'a']--;
			System.out.println("String value 2-->" + ch[stringvalue2.charAt(i) - 'a']--);
		}
		for (int count : ch) {
			if (count != 0) {
				System.out.print("They are not anagrams");
				return false;
			}

		}
		System.out.print("They are anagrams");
		return true;
	}

}
