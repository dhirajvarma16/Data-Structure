package JavaProgramPractice2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Leaders_in_an_array {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack1 = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);
		int[] values = new int[6];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
			stack.add(values[i]);
		}
		System.out.println("Stack Value -->" + stack);
		Iterator iterator = stack.iterator();
		while (iterator.hasNext()) {
			if (stack1.isEmpty()) {
				stack1.add(stack.peek());
				System.out.println("Stack Value 1" + stack1);
				stack.pop();
			} else if (stack.peek() > stack1.peek()) {
				stack1.add(stack.peek());
				System.out.println("Stack Value 1" + stack1);
				stack.pop();
			} else {
				stack.pop();
			}
		}
		List<Integer> arraryvalues = new LinkedList<Integer>();
		while (stack1.size() != 0) {
			arraryvalues.add(stack1.peek());
			stack1.pop();
		}
		System.out.println("sorted Value -->" + arraryvalues);

	}

}
