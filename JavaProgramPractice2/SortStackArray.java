package JavaProgramPractice2;

import java.util.Stack;

public class SortStackArray {
	public static Stack<Integer> stack2 = new Stack<Integer>();
	public static Stack<Integer> stack1 = new Stack<Integer>();

	public static void main(String[] args) {
		stack1.push(9);
		stack1.push(-1);
		stack1.push(120);
		stack1.push(2);
		System.out.println(" O/P " + SortStackArray.SortStackArray(stack1));
	}

	public static Stack<Integer> SortStackArray(Stack<Integer> stack) {

		for (Integer integer : stack) {
			if (stack2.isEmpty()) {
				stack2.push(integer);
			} else if (stack.peek() < stack2.peek()) {
				stack2.pop();
				stack.push(integer);
			} /*
				 * else { SortStackArray(stack2); }
				 */
		}
		return stack2;
	}
}