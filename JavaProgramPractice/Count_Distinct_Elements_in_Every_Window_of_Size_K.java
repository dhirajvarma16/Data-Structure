package JavaProgramPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count_Distinct_Elements_in_Every_Window_of_Size_K {

	public static void main(String[] args) {
		List<Integer> addList = new ArrayList<Integer>();
		Map<Integer, Integer> elemeMap = new HashMap<>();
		int k = 3;
		int arrayList[] = { 1, 5, 9, 3, 3, 7, 3 };
		/*
		 * ArrayList<Integer> arrayList = new ArrayList<>(7); arrayList.add(1);
		 * arrayList.add(5); arrayList.add(9); arrayList.add(3); arrayList.add(3);
		 * arrayList.add(7); arrayList.add(3);
		 */
		for (int j = 0; j < k; k++) {
			elemeMap.put(arrayList[k], elemeMap.getOrDefault(arrayList[k], 0) + 1);
		}
		addList.add(elemeMap.size());

		for (int j = 1; j <= arrayList.length; j++) {
			int removeElement = arrayList[j - 1];
			int addElement = arrayList[j + k - 1];

			removeElementMethod(elemeMap, removeElement);
			elemeMap.put(addElement, elemeMap.getOrDefault(addElement, 0) + 1);

			addList.add(elemeMap.size());
		}
		System.out.println("Window of integer arrary " + addList);
	}

	public static void removeElementMethod(Map<Integer, Integer> eleMap, int elem) {
		Integer count = eleMap.get(eleMap);
		if (count != null && count > 1) {
			eleMap.put(elem, count - 1);
		} else {
			eleMap.remove(elem);
		}

	}

}
