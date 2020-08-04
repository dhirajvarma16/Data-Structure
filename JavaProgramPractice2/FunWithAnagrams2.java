package JavaProgramPractice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FunWithAnagrams2 {

	public static void main(String[] args) {
		String[] stringsvalues = { "code", "doce", "ecod", "framer", "frame" };
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> listset = new HashSet<String>();
		List<String> list = new LinkedList<String>();

		for (int i = 0; i < stringsvalues.length; i++) {

			char[] ch = stringsvalues[i].toCharArray();
			Arrays.sort(ch);
			new String(ch);
			map.put(new String(ch), map.getOrDefault(new String(ch), 0) + 1);
			System.out.println("String value -->" + new String(ch));
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			if (!listset.contains(entry.getKey())) {
				listset.add(entry.getKey());
				list.add(entry.getKey());
			}
		}

		Collections.sort(list);

		System.out.println(list);
		/*
		 * Iterator<String> iterator = listset.iterator(); while (iterator.hasNext()) {
		 * list.add(iterator); }
		 */
	}

}
