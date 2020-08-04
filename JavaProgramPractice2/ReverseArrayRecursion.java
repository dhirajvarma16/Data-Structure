package JavaProgramPractice2;

import java.util.Scanner;

public class ReverseArrayRecursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of arrary");
		int n = in.nextInt();
	}

	public static void reverse(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}

		// Logic to swap
		int temp;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		// Recursive call
		reverse(arr, start + 1, end - 1);
	}

}
