package JavaProgramPractice2;

import java.util.Scanner;

public class Reverse_Arrary_without_Using_Another_Arrary {

	public static void main(String[] args) {
		// List<Integer> list = new ArrayList<Integer>();
		int[] arrayLists = new int[5];
		Scanner scanner = new Scanner(System.in);
		int[] value = new int[5];
		for (int i = 0; i < 5; i++) {
			value[i] = scanner.nextInt();
			arrayLists[i] = value[i];
			// System.out.print("list output:" + arrayLists[i]);
		}

		for (int i = 0; i < arrayLists.length; i++) {
			for (int j = i + 1; j < arrayLists.length; j++) {
				if (arrayLists[i] > arrayLists[j]) {
					arrayLists[i] = arrayLists[i] - arrayLists[j];
					arrayLists[j] = arrayLists[i] + arrayLists[j];
					arrayLists[i] = arrayLists[j] - arrayLists[i];
				} else if (arrayLists[i] < arrayLists[j]) {
					continue;
				}
			}
		}

		for (int j = 0; j < arrayLists.length; j++) {
			System.out.println("" + arrayLists[j]);
		}
	}

}
