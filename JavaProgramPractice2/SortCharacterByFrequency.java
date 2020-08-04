package JavaProgramPractice2;

import java.util.HashMap;
import java.util.Map;

public class SortCharacterByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String frequencySortString(String s) {
		StringBuilder sbBuilder = new StringBuilder();
		Map<Character, Integer> charCountMap = new HashMap<>();

		int len = s.length();
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

			charCountMap.entrySet().stream().sorted(Map.Entry < Character, Integer > comparingByValue().reversed()).
			forEach( record ->{
			Character key= record.getKey();
            int value =record.getValue();

            for (int j = 0; j < value; j++) {
               sbBuilder.append(Key);
			}

					);
		}
	}

}
