package JavaProgramPractice2;

import java.util.Stack;

public class Remove_K_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String removeKdigit(String num, int k) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
		}

		for (char ch : num.toCharArray()) {

			while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
				stack.pop();
				k--;
			}
			stack.push(ch);
		}

		for (int i = 0; i < k; i++) {
			stack.pop();
		}

		StringBuilder sBuilder = new StringBuilder();
		while (!stack.isEmpty()) {
			sBuilder.append(stack.pop());
		}
		sBuilder.reverse();

		while (sBuilder.length() > 1 && sBuilder.charAt(0) == '0') {
			sBuilder.deleteCharAt(0);
		}
		return sBuilder.toString();
	}

}
