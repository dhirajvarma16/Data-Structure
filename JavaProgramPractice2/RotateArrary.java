package JavaProgramPractice2;

public class RotateArrary {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int len = arr.length;
		int temp;
		int start = 0, end = arr.length;
		for (int i = 0; i < 2; i++) {
			temp = arr[0];
			while (len > 0) {
				arr[len] = arr[start];

			}
		}

	}

}
