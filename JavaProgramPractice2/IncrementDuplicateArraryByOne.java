package JavaProgramPractice2;

import java.util.Iterator;
import java.util.Stack;

public class IncrementDuplicateArraryByOne {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 7 };
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!stack.isEmpty()) {
				if (stack.add(arr[i])) {
					stack.add(arr[i]);
				} else {
					arr[i] = arr[i] + 1;
					i--;
				}
			} else {
				stack.add(arr[i]);
			}
		}
		Iterator<Integer> valueIterator = stack.iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}

	}

}
