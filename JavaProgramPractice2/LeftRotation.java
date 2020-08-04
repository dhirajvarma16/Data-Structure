package JavaProgramPractice2;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
		int arr[];
		int d, temp, n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		d = scanner.nextInt();
		arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		while (d != 0) {
			temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
			d--;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
