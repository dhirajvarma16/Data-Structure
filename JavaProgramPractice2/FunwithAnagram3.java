package JavaProgramPractice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FunwithAnagram3 {
	public static void main(String[] args) {
		FunwithAnagram3 fn3 = new FunwithAnagram3();
		Scanner scanner = new Scanner(System.in);
		int numberofvalues = scanner.nextInt();
		String[] strings = new String[numberofvalues];
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < numberofvalues; i++) {
			strings[i] = scanner.next();
			list.add(strings[i]);
		}
		fn3.listofStrings(list);

		System.out.print("List value -->" + fn3.ans);
	}

	List<String> ans = new LinkedList<String>();
	Set<String> setvaluekey = new HashSet<String>();

	public List<String> listofStrings(List<String> valueStrings) {
		String wordString = null;
		String keyString = null;
		for (int i = 0; i < valueStrings.size(); i++) {
			wordString = valueStrings.get(i);
			keyString = sortStringKey(wordString);
			if (!setvaluekey.contains(keyString)) {
				setvaluekey.add(keyString);
				ans.add(wordString);
			}
		}
		Collections.sort(ans);
		return ans;
	}

	public String sortStringKey(String valuekey) {
		char[] ch = valuekey.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

}
