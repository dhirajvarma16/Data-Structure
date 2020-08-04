package JavaProgramPractice2;

import java.util.Stack;

public class AnagramCheck {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String string = "cbacab", string2 = "abc";
		int k = 0;
		char[] ch = new char[string2.length()];
		char[] ch1 = new char[string.length()];
		char[] ch2 = new char[string2.length()];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = string2.charAt(i);
			stack.push(ch[i]);
		}
		System.out.println("Stack " + stack);

		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				ch2[j] = string.charAt(j + k);
				if (stack.contains(ch2[i]) == false) {
					System.out.println(" is not a angram");
				}
			}
			System.out.println(" is a angram");
			k++;
		}

	}

}
