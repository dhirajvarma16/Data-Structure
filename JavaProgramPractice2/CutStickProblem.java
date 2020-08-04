package JavaProgramPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CutStickProblem {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 5 };
		int n = 1;
		List<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println("Minimum arrary values " + Collections.min(list));
		int val1 = Collections.min(list);
		while (n < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					arr[i] = arr[i] - val1;
					stack.push(arr[i]);
					list.add(arr[i]);
				} else {
					continue;
				}
			}
			n++;
		}
		Iterator<Integer> valueIterator = stack.iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}

	}
}
