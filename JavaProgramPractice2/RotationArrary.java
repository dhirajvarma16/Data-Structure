package JavaProgramPractice2;

import java.util.Stack;

public class RotationArrary {
	static int arr[] = { 1, 20, 2, 10 };
	static int arr1[] = new int[arr.length];
	static int temp;
	static int sum = 0;
	public static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				sum = sum + j * arr[j];
				if (stack.isEmpty()) {
					stack.push(sum);
				} else if (sum > stack.peek()) {
					stack.pop();
					stack.push(sum);
				}
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.print("Stack Value: " + stack.peek());

	}

}
